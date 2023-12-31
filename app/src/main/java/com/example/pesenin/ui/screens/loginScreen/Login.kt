package com.example.pesenin.ui.screens.loginScreen

import android.content.Context
import android.content.res.Resources
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.provider.OpenableColumns
import android.webkit.MimeTypeMap
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.School
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pesenin.R
import com.example.pesenin.ui.theme.PeseninTheme
import com.google.firebase.Firebase
import com.google.firebase.storage.storage
import java.io.ByteArrayOutputStream

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel? = null,
    onNavToHomePage:() -> Unit,
    onNavToSignUpPage:() -> Unit,
){
    val loginUiState = loginViewModel?.loginUiState
    val isError = loginUiState?.loginError!= null
    val context = LocalContext.current

    Column(
        modifier= Modifier
            .paint(
                painterResource(id = R.drawable.gkm),
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.BottomCenter
            )
            .fillMaxSize()
    ) {
        if(isError){
            Text(
                text = loginUiState?.loginError ?: "Isilah data dengan lengkap!",
                modifier = Modifier.background(color = Color.Red).fillMaxWidth(),
                color = Color.White,
            )
        }
        Column (modifier = Modifier
            .fillMaxWidth()
            .height(420.dp)
            .background(color = Color(0xFFF4F5F9), shape = RoundedCornerShape(size = 30.dp)) ){
            Text(
                text = "Selamat Datang!",
                modifier = Modifier.padding(start = 21.dp, top = 30.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 24.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF303030),

                    textAlign = TextAlign.Center,
                )
            )

            Text(
                text = "Masuk ke akun anda",
                modifier = Modifier.padding(start = 21.dp, top = 5.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 18.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8B9094),

                    )
            )

            Row (modifier = Modifier.padding(start = 21.dp, top = 23.dp, end = 21.dp)){
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFFFFFFFF)),
                    value = loginUiState?.email ?: "",
                    onValueChange = {loginViewModel?.onEmailChange(it)},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.MailOutline,
                            contentDescription = null,
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xFFFFFFFF),
                    ),
                    label = {
                        Text(
                            text = "Masukkan email anda",
                            color = Color(0xFF8B9094),
                            fontSize = 14.sp
                        )
                    },
                    isError = isError
                )
            }
            var passwordVisible by remember { mutableStateOf(false) }

            Row (modifier = Modifier.padding(start = 21.dp, top = 22.dp, end = 21.dp)){
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFFFFFFFF))
                    ,
                    value = loginUiState?.password ?: "",
                    onValueChange = {loginViewModel?.onPasswordChange(it)},
                    visualTransformation = if (passwordVisible) {
                        PasswordVisualTransformation()
                    } else {
                        PasswordVisualTransformation(mask = '*')
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Password
                    ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Lock,
                            contentDescription = null,
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(unfocusedBorderColor = Color(0xFFFFFFFF),
                    ),
                    label = {
                        Text(
                            text = "Masukkan password anda",
                            color = Color(0xFF8B9094),
                            fontSize = 14.sp
                        )
                    },
                    isError = isError
                )
            }

            Button(onClick = { loginViewModel?.loginUser(context) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 21.dp, top = 30.dp, end = 21.dp)
                    .background(color = Color(0xFF829BC2), shape = RoundedCornerShape(size = 8.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF829BC2))
            ) {
                Text(
                    text = "Masuk",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),

                        )
                )
            }

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center,
            ){
                Text(
                    text = "Belum mempunyai akun? ",
                    modifier = Modifier.padding(top=13.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 18.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF8B9094),

                        )
                )
                TextButton(onClick = { onNavToSignUpPage.invoke() }) {
                    Text(
                        text = "Daftar",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF303030),

                            )
                    )
                }

                if(loginUiState?.isLoading == true){
                    CircularProgressIndicator()
                }

                LaunchedEffect(key1 = loginViewModel?.hasUser){
                    if(loginViewModel?.hasUser == true){
                        onNavToHomePage.invoke()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    loginViewModel: LoginViewModel? = null,
    onNavToHomePage:() -> Unit,
    onNavToLoginPage:() -> Unit,
){
    val loginUiState = loginViewModel?.loginUiState
    val isError = loginUiState?.signUpError!= null
    val context = LocalContext.current
    val isUploading = remember{ mutableStateOf(false) }
    val img:Bitmap = BitmapFactory.decodeResource(Resources.getSystem(),android.R.drawable.ic_menu_report_image)
    val bitmap = remember { mutableStateOf(img)}

    var imageUri by remember { mutableStateOf<Uri?>(null) }
    var fileName by remember { mutableStateOf<String>("") }

    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.TakePicturePreview()) {
        if(it !=null){
            bitmap.value = it
        }
    }


    val launchImage = rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) { uri: Uri? ->
        uri?.let {
            imageUri = it

            val contentResolver = context.contentResolver
            val mimeTypeFilter = MimeTypeMap.getSingleton().getMimeTypeFromExtension(contentResolver.getType(it))
            val cursor: Cursor? = contentResolver.query(it, null, null, null, null)
            fileName = cursor?.use { it ->
                it.moveToFirst()
                val nameIndex: Int = it.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                it.getString(nameIndex)
            }!!


            if (Build.VERSION.SDK_INT < 34) {
                bitmap.value = MediaStore.Images.Media.getBitmap(context.contentResolver, it)
            } else {
                val source = ImageDecoder.createSource(context.contentResolver, it)
                bitmap.value = ImageDecoder.decodeBitmap(source)
            }
            loginViewModel?.onProfilChange(bitmap.value, imageUri!!, img.toString())
        }
    }

    Column(
        modifier= Modifier
            .paint(
                painterResource(id = R.drawable.gkm_signup),
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.BottomCenter
            )
            .fillMaxSize()
    ) {
        if (isError) {
            Text(
                text = loginUiState?.loginError ?: "Isilah data dengan lengkap!",
                modifier = Modifier.background(color = Color.Red).fillMaxWidth(),
                color = Color.White,
            )
        }

        Column (modifier = Modifier
            .fillMaxWidth()
            .height(665.dp)
            .background(color = Color(0xFFF4F5F9), shape = RoundedCornerShape(size = 30.dp)) ) {

            Text(
                text = "Buat Akun",
                modifier = Modifier.padding(start = 21.dp, top = 20.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 24.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF303030),

                    textAlign = TextAlign.Center,
                )
            )

            Text(
                text = "Masukkan data di bawah ini",
                modifier = Modifier.padding(start = 21.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 18.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8B9094),

                    )
            )

            Column (modifier = Modifier.padding(start = 21.dp, top = 15.dp, end = 21.dp)){
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFFFFFFFF))
                    ,
                    value = loginUiState?.emailSignUp ?: "",
                    onValueChange = {loginViewModel?.onEmailSignUpChange(it)},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.MailOutline,
                            contentDescription = null,
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xFFFFFFFF),
                    ),
                    label = {
                        Text(
                            text = "Email",
                            color = Color(0xFF8B9094),
                            fontSize = 14.sp
                        )
                    },
                    isError = isError
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .background(color = Color(0xFFFFFFFF))
                    ,
                    value = loginUiState?.nimSignUp ?: "",
                    onValueChange = {loginViewModel?.onNimChangeSignUp(it)},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.School,
                            contentDescription = null,
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xFFFFFFFF),
                    ),
                    label = {
                        Text(
                            text = "NIM",
                            color = Color(0xFF8B9094),
                            fontSize = 14.sp
                        )
                    },
                    isError = isError
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .background(color = Color(0xFFFFFFFF))
                    ,
                    value = loginUiState?.phoneSignUp ?: "",
                    onValueChange = {loginViewModel?.onPhoneChangeSignUp(it)},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Call,
                            contentDescription = null,
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xFFFFFFFF),
                    ),
                    label = {
                        Text(
                            text = "Nomor Telepon",
                            color = Color(0xFF8B9094),
                            fontSize = 14.sp
                        )
                    },
                    isError = isError
                )

                var password1Visible by remember { mutableStateOf(false) }
                var password2Visible by remember { mutableStateOf(false) }

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .background(color = Color(0xFFFFFFFF))
                    ,
                    value = loginUiState?.passwordSignUp ?: "",
                    onValueChange = {loginViewModel?.onPasswordChangeSignUp(it)},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Lock,
                            contentDescription = null,
                        )
                    },
                    visualTransformation = if (password1Visible) {
                        PasswordVisualTransformation()
                    } else {
                        PasswordVisualTransformation(mask = '*')
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Password
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xFFFFFFFF),
                    ),
                    label = {
                        Text(
                            text = "Password",
                            color = Color(0xFF8B9094),
                            fontSize = 14.sp
                        )
                    },
                    isError = isError
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .background(color = Color(0xFFFFFFFF))
                    ,
                    value = loginUiState?.confirmPasswordSignUp ?: "",
                    onValueChange = {loginViewModel?.onConfirmPasswordChange(it)},
                    visualTransformation = if (password2Visible) {
                        PasswordVisualTransformation()
                    } else {
                        PasswordVisualTransformation(mask = '*')
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Password
                    ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Lock,
                            contentDescription = null,
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xFFFFFFFF),
                    ),
                    label = {
                        Text(
                            text = "Konfirmasi Password",
                            color = Color(0xFF8B9094),
                            fontSize = 14.sp
                        )
                    },
                    isError = isError
                )

                Text(
                    text = "Unggah foto Profil",
                    modifier = Modifier
                        .padding(top=10.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 18.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFF8B9094),

                        )
                )

                Row {
                    Button(onClick = { launchImage.launch("image/*") },
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .background(
                                color = Color(0xFF96ABCB),
                                shape = RoundedCornerShape(size = 7.dp)
                            ),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF96ABCB))
                    ) {
                        Text(text = "Pilih File", textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 14.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFFFFFFFF),

                                textAlign = TextAlign.Center,
                            ))

                    }
                    imageUri?.let { _ ->
                        Text(
                            text = fileName,
                            modifier = Modifier.padding(start=12.dp, top=22.dp),
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 14.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF8B9094),

                                )
                        )
                    }

                }
            }

            Button(onClick = {
                loginViewModel?.createUser(context as ComponentActivity)
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 10.dp, end = 16.dp)
                    .background(color = Color(0xFF829BC2), shape = RoundedCornerShape(size = 8.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF829BC2))
            ) {
                Text(text = "Buat Akun",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),

                        ))
            }


            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ){
                Text(text = "Sudah memiliki akun? ",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 18.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF8B9094),

                        ),
                    modifier = Modifier.padding(top=13.dp))
                TextButton(onClick = { onNavToLoginPage.invoke()}) {
                    Text(text = "Login",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 18.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF303030),
                        )
                    )
                }
            }

            if(loginUiState?.isLoading == true){
                CircularProgressIndicator()
            }

            LaunchedEffect(key1 = loginViewModel?.hasUser){
                if(loginViewModel?.hasUser == true){
                    onNavToHomePage.invoke()
                }
            }
        }
    }
}

fun uploadImageToFirebase(bitmap: Bitmap, context: Context, callback: (Boolean)->Unit) {
    val storageRef = Firebase.storage.reference
    val imageRef = storageRef.child("ktm/${bitmap}")
    val baos = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG,100,baos)
    val imageData = baos.toByteArray()
    imageRef.putBytes(imageData).addOnSuccessListener {
        callback(true)
    }.addOnFailureListener{
        callback(false)
    }
}

@Preview(showSystemUi = true)
@Composable
fun PrevLoginScreen(){
    PeseninTheme {
        LoginScreen(onNavToHomePage = { /*TODO*/ }) {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PrevSignUpScreen(){
    PeseninTheme {
        SignUpScreen(onNavToHomePage = { /*TODO*/ }) {

        }
    }
}
