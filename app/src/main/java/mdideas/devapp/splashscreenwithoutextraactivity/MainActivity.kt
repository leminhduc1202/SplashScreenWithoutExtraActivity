package mdideas.devapp.splashscreenwithoutextraactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //add logo đuôi svg or psd vào Drawable và tuỳ chỉnh size phù hợp
        //Tạo file splash_image dạng layer list
        //Vào themes add thêm style splashScreenTheme
        //Vào AndroidManifest thay theme đang dùng bằng style splashScreenTheme vừa tạo
        //Vào MainActivity thêm dòng lệnh bênh dưới
        setTheme(R.style.Theme_SplashScreenWithoutExtraActivity)
        setContentView(R.layout.activity_main)
    }
}