package com.example.navigation.components.screens.Routines

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigation.components.TabRowItem
import com.example.navigation.components.screens.Ideas
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.pagerTabIndicatorOffset
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun CreateThing(
    navController: NavHostController
) {
    val tabRowItems = listOf(
        TabRowItem(
            title = "THINGS",
            screen = { },
        ),
        TabRowItem(
            title = "SCENES",
            screen = { },
        ),
        TabRowItem(
            title = "ROUTINES",
            screen = { },
        )
    )
        val pagerState = rememberPagerState()
        val coroutineScope = rememberCoroutineScope()
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
                        text = "Create A Thing",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
        },
        content = {
            Column() {
                TabRow(
                    backgroundColor = Color.White,
                    selectedTabIndex = pagerState.currentPage,
                    indicator = { tabPositions ->
                        TabRowDefaults.Indicator(
                            Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                            color = Color.Black
                        )
                    },
                ) {
                    tabRowItems.forEachIndexed { index, item ->
                        Tab(
                            selected = pagerState.currentPage == index,
                            onClick = { coroutineScope.launch { pagerState.animateScrollToPage(index) } },
                            text = {
                                Text(
                                    text = item.title,
                                    color = Color.Black
                                )
                            }
                        )
                    }
                }
                HorizontalPager(
                    pageCount = tabRowItems.size,
                    state = pagerState,
                ) {
                    tabRowItems[pagerState.currentPage].screen()
                }
            }
        }
    )
}