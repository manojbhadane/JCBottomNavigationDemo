import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jcbottomnavigationdemo.navigation.NavigationItem

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.History.route) {
            HistoryScreen()
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
    }
}