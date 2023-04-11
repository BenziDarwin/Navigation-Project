package com.example.navigation.components

sealed class Screens(
    var route: String,
    var title: String,
) {
    object SelectRoutine: Screens(
        route = "selectroutine",
        title = "Select Routine"
    )

    object CreateRoutine: Screens(
        route = "createroutine",
        title = "Create Routine"
    )
    object SelectEvent: Screens(
        route = "selectevent",
        title = "Select Event"
    )
    object CreateRoutineDatePick: Screens(
        route = "createroutinedatepick",
        title = "Create Routine"
    )
    object CreateThing: Screens(
        route = "creatething",
        title = "Create Thing"
    )
}