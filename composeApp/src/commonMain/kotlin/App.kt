import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mmk.kmpnotifier.notification.NotifierManager
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    var myPushNotificationToken by remember { mutableStateOf("") }
    LaunchedEffect(true) {
        println("LaunchedEffectApp is called")
        NotifierManager.addListener(object : NotifierManager.Listener {
            override fun onNewToken(token: String) {
                myPushNotificationToken = token
                println("onNewToken: $token")
            }
        })
        // myPushNotificationToken = NotifierManager.getPushNotifier().getToken() ?: ""
    }


    MaterialTheme {
        Column(
            Modifier.fillMaxSize().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
//            val notifier = remember { NotifierManager.getLocalNotifier() }
//            val permissionUtil = remember { NotifierManager.getPermissionUtil() }
//            var notificationId by remember { mutableStateOf(0) }
//            Button(onClick = {
//                notificationId = notifier.notify("Title", "bodyMessage")
//            }) {
//                Text("Send Local Notification")
//            }
//            Button(onClick = { notifier.removeAll() }) {
//                Text("Remove all notifications")
//            }
//
//            Button(enabled = notificationId != 0, onClick = {
//                notifier.remove(notificationId)
//                notificationId = 0
//            }) {
//                Text("Remove NotificationID #$notificationId")
//            }
//
//            Text(
//                modifier = Modifier.padding(20.dp),
//                text = "FirebaseToken: $myPushNotificationToken",
//                style = MaterialTheme.typography.body1,
//                textAlign = TextAlign.Start,
//            )
//
//
//            Button(onClick = {
//                permissionUtil.askNotificationPermission {
//                    println("Permission is granted")
//                }
//            }) {
//                Text("Ask permission")
//            }

            Text("Hello World")
        }
    }
}