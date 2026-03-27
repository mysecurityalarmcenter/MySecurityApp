package com.mysecurity.alarm

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // SharedPreferences başlat (ayarlar için)
        sharedPreferences = getSharedPreferences("MySecurityAlarm", MODE_PRIVATE)
        
        // Material tasarım başlığını gizle
        supportActionBar?.hide()
        
        // ScrollView oluştur
        val scrollView = ScrollView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }
        
        // Ana layout oluştur
        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(android.graphics.Color.parseColor("#0f1419"))
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        // Logo ImageView
        val logoImageView = ImageView(this).apply {
            setImageResource(R.drawable.logo)
            layoutParams = LinearLayout.LayoutParams(
                280,
                280
            ).apply {
                setMargins(0, 30, 0, 15)
                gravity = android.view.Gravity.CENTER_HORIZONTAL
            }
            scaleType = ImageView.ScaleType.CENTER_INSIDE
        }

        // Login başlığı
        val loginTitle = android.widget.TextView(this).apply {
            text = "Erişim için Giriş Yapın"
            textSize = 18f
            setTextColor(android.graphics.Color.WHITE)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(20, 15, 20, 0)
            }
            gravity = android.view.Gravity.CENTER
            typeface = android.graphics.Typeface.create(
                android.graphics.Typeface.DEFAULT,
                android.graphics.Typeface.BOLD
            )
        }

        // Login alt başlığı
        val loginSubtitle = android.widget.TextView(this).apply {
            text = "Güvenlik sistemine erişmek için lütfen giriş yapınız"
            textSize = 13f
            setTextColor(android.graphics.Color.parseColor("#99ffffff"))
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(20, 6, 20, 16)
            }
            gravity = android.view.Gravity.CENTER
        }

        // Giriş butonu
        val loginButton = Button(this).apply {
            text = "Giriş Portalına Git →"
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                56
            ).apply {
                setMargins(20, 16, 20, 0)
            }
            setBackgroundColor(android.graphics.Color.parseColor("#00ffc8"))
            setTextColor(android.graphics.Color.BLACK)
            textSize = 14f
            typeface = android.graphics.Typeface.create(
                android.graphics.Typeface.DEFAULT,
                android.graphics.Typeface.BOLD
            )
            setOnClickListener {
                openLoginPortal()
            }
        }

        // Acil numarası
        val emergencyLayout = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(20, 24, 20, 0)
            }
        }

        val emergencyLabel = android.widget.TextView(this).apply {
            text = "📞 Acil Durum: "
            textSize = 13f
            setTextColor(android.graphics.Color.parseColor("#99ffffff"))
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        val emergencyNumber = android.widget.TextView(this).apply {
            text = "0850 532 0155"
            textSize = 13f
            setTextColor(android.graphics.Color.WHITE)
            typeface = android.graphics.Typeface.create(
                android.graphics.Typeface.DEFAULT,
                android.graphics.Typeface.BOLD
            )
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setOnClickListener {
                callEmergency()
            }
        }

        emergencyLayout.addView(emergencyLabel)
        emergencyLayout.addView(emergencyNumber)

        // Email
        val emailLayout = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(20, 8, 20, 0)
            }
        }

        val emailLabel = android.widget.TextView(this).apply {
            text = "📧 İletişim: "
            textSize = 13f
            setTextColor(android.graphics.Color.parseColor("#99ffffff"))
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        val emailAddress = android.widget.TextView(this).apply {
            text = "info@mysecurity.com.tr"
            textSize = 13f
            setTextColor(android.graphics.Color.WHITE)
            typeface = android.graphics.Typeface.create(
                android.graphics.Typeface.DEFAULT,
                android.graphics.Typeface.BOLD
            )
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setOnClickListener {
                sendEmail()
            }
        }

        emailLayout.addView(emailLabel)
        emailLayout.addView(emailAddress)

        // Version info
        val versionInfo = android.widget.TextView(this).apply {
            text = "Sürüm 1.0.0 | © My Security Alarm Center"
            textSize = 10f
            setTextColor(android.graphics.Color.parseColor("#55ffffff"))
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(20, 30, 20, 20)
            }
            gravity = android.view.Gravity.CENTER
        }

        // Hepsini main layout'a ekle
        mainLayout.addView(logoImageView)
        mainLayout.addView(loginTitle)
        mainLayout.addView(loginSubtitle)
        mainLayout.addView(loginButton)
        mainLayout.addView(emergencyLayout)
        mainLayout.addView(emailLayout)
        mainLayout.addView(versionInfo)

        scrollView.addView(mainLayout)
        setContentView(scrollView)
    }

    private fun openLoginPortal() {
        val loginUrl = "https://oim.alarmdc.com/Kullanici/Login?ReturnUrl=%2f"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(loginUrl))
        startActivity(intent)
    }

    private fun callEmergency() {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:08505320155"))
        startActivity(intent)
    }

    private fun sendEmail() {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "message/rfc822"
            putExtra(Intent.EXTRA_EMAIL, arrayOf("info@mysecurity.com.tr"))
            putExtra(Intent.EXTRA_SUBJECT, "My Security Alarm - Destek Talep")
            putExtra(Intent.EXTRA_TEXT, "")
        }
        startActivity(Intent.createChooser(intent, "Email Gönder"))
    }
}
