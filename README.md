# My Security Alarm - Android Uygulaması

## Kurulum Talimatları

### Gereksinimler
- Android Studio 4.2 veya daha yeni sürüm
- JDK 8 veya daha yeni sürüm
- Android SDK 24 (Android 7.0) veya daha yeni sürüm

### Proje Açma
1. Android Studio'yu açın
2. "File" → "Open" seçin
3. MySecurityApp klasörünü seçin
4. Android Studio projeyi şifreyi çözüp derlemesini bekleyin

### APK Oluşturma

#### Seçenek 1: Android Studio UI
1. "Build" menüsünden "Build Bundle(s) / APK(s)" seçin
2. "Build APK(s)" tıklayın
3. Build tamamlandığında, APK dosyası şu konumda bulunur:
   `app/build/outputs/apk/debug/app-debug.apk`

#### Seçenek 2: Komut Satırı
```bash
./gradlew build
```

### Release APK (Google Play'e Yayınlamak İçin)
1. Android Studio'da "Build" → "Generate Signed Bundle / APK" seçin
2. APK seçeneğini işaretleyin
3. "Next" tıklayın
4. Yeni keystore oluşturun veya mevcut olanı seçin
5. Tamamlayın

### Uygulamanın Özellikleri

✅ **My Security Alarm Center Branding**
- Orijinal logonuz başlık kısmında yer alıyor
- Modern, profesyonel tasarım
- Neon mavi ve cyan renkleri

✅ **Fonksiyonlar**
- Giriş portalına doğrudan erişim: https://oim.alarmdc.com/Kullanici/Login
- Acil durum numarası gösterimi: 0850 532 0155
- Email iletişim: info@mysecurity.com.tr
- Türkçe dil desteği

✅ **Sistem Gereksinimleri**
- Minimum Android 7.0 (API 24)
- Target Android 13 (API 33)

### Hata Giderme

**Gradle Hataları:**
- File → Invalidate Caches → Invalidate and Restart seçin
- build.gradle dosyalarında tanımlanmış kotlin versiyonunu güncelleyin

**Logo Görünmemiyor:**
- res/drawable klasöründe logo.png dosyasının var olduğunu kontrol edin
- ImageView'in layoutParams değerlerini kontrol edin (300x300 çalışması gerekir)

**Build Başarısız:**
- Android SDK'nın güncel olduğundan emin olun
- Kotlin plugin sürümünü kontrol edin
- JDK versiyonunu kontrol edin (1.8 veya üzeri gereklidir)

### Google Play Store'a Yayınlama

1. Google Play Developer hesabı oluşturun (bir kez $25)
2. Yukarıdaki "Release APK" bölümündeki adımları izleyin
3. Privacy Policy oluşturun
4. App Store Listing'i doldurun:
   - App Title: My Security Alarm Center
   - Short Description: Güvenlik sisteminizi kontrol edin
   - Full Description: Detaylı açıklama yazın
   - Screenshots: En az 2 tane (müşteri cihazından)
   - App Icon: 512x512px

5. İçerik derecesi formunu doldurun
6. Fiyatlandırma seçin (ücretsiz olarak ayarlanmıştır)
7. "Submit for Review" tıklayın

### İletişim
- Email: info@mysecurity.com.tr
- Acil: 0850 532 0155

---
Hazırlayan: My Security Alarm Center
