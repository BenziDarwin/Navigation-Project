package com.example.navigation.components.screens.Routines

import android.annotation.SuppressLint
import android.app.TimePickerDialog
import android.widget.TimePicker
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.navigation.components.RoutineViewModel
import com.example.navigation.data.Graph
import com.example.navigation.data.Routine
import com.example.navigation.data.RoutineDataSource
import java.util.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateRoutine(
    navController: NavHostController,
    pickDate:Boolean = false
) {
    val mContext = LocalContext.current
    val mCalendar = Calendar.getInstance()
    val mHour = mCalendar[Calendar.HOUR]
    val mMinute = mCalendar[Calendar.MINUTE]
    val viewModel = viewModel(RoutineViewModel::class.java)
    val state by viewModel.state.collectAsState()
    var mTime by remember{ mutableStateOf(state.event) }
    val mTimePickerDialog = TimePickerDialog(
        mContext,
        {_, mHour:Int, mMinute: Int -> mTime = "$mHour : $mMinute"
        }, mHour, mMinute, true
    )
    if (pickDate) {
        mTimePickerDialog.show()
    }
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Yellow,
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "Create A Routine",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        tint = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .clickable { navController.navigate("favorites") }
                    )

                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Submit",
                        tint = Color.Black,
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
            }
        },
        content = {
            var title by remember { mutableStateOf(TextFieldValue("")) }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .padding(top = 10.dp),
            ) {
                Column(modifier = Modifier
                    .verticalScroll(rememberScrollState())
                ) {
                    TextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp),
                        value = title,
                        onValueChange = {
                            title = it

                        },
                        placeholder = { Text(text = "Routine Name") },
                    )
                    Text(
                        text = "When",
                        fontSize = 30.sp)
                    if(mTime == ""){
                        Text(
                            text = "Want this event to run automatically? Add an event below.",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Gray)
                                .padding(20.dp)
                        )
                    }else{
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "Time",
                                    modifier = Modifier
                                        .size(60.dp)
                                        .padding(end = 10.dp)
                                )
                                Column() {
                                    Text(
                                        text = "Date & Time",
                                        fontSize = 25.sp,
                                        modifier = Modifier
                                            .padding(top = 20.dp))
                                    Text(
                                        text = "The time is ${mTime}",
                                        fontSize = 25.sp,
                                        modifier = Modifier
                                            .padding(bottom = 20.dp))
                                }
                            }
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Settings",
                                modifier = Modifier
                                    .align(Alignment.CenterEnd)
                                    .size(60.dp)
                            )
                        }
                    }

                        Box(
                            contentAlignment = Alignment.CenterEnd,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, end = 10.dp)
                        ) {
                            Row(){
                                Text(text = "Add Event",
                                    fontSize = 25.sp)
                                Spacer(modifier = Modifier.width(10.dp))
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .size(40.dp)
                                        .clickable { navController.navigate("selectevent") }
                                        .background(Color.Blue)
                                ){
                                    Icon(
                                        imageVector = Icons.Default.Add,
                                        contentDescription = "Add Routine",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(35.dp)
                                    )
                                }
                            }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Run These Actions",
                        fontSize = 30.sp)
                    Text(
                        text = "No Actions. Tap Below to add one.",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Gray)
                            .padding(20.dp)
                    )
                    Box(
                        contentAlignment = Alignment.CenterEnd,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, end = 10.dp)
                    ) {
                        Row(){
                            Text(text = "Add Action",
                                fontSize = 25.sp)
                            Spacer(modifier = Modifier.width(10.dp))
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(40.dp)
                                    .clickable { navController.navigate("creatething") }
                                    .background(Color.Blue)
                            ){
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Add Routine",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(35.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "But Only if",
                        fontSize = 30.sp)
                    Text(
                        text = "Add an event before adding conditions.",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Gray)
                            .padding(20.dp)
                    )
                }
            }
        }
    )
}