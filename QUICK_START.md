# 🚀 MY SECURITY ALARM CENTER - HIZLI BAŞLAMA

## 📦 Paketinizde Neler Var?

```
MySecurityApp_Complete/
├── app/                                    # Android uygulaması
│   ├── src/main/
│   │   ├── AndroidManifest.xml            # Uygulama konfigürasyonu
│   │   ├── java/com/mysecurity/alarm/
│   │   │   └── MainActivity.kt            # Ana ekran (Kotlin)
│   │   └── res/
│   │       ├── drawable/logo.png          # 🎨 SİZİN LOGONUZ
│   │       ├── drawable/ic_launcher.xml
│   │       └── values/ (renkler, yazılar)
│   └── build.gradle                       # Bağımlılıklar
│
├── 📄 DOKÜMANTASYON:
│   ├── PRIVACY_POLICY.md                  # Gizlilik Politikası (Google Play)
│   ├── GOOGLE_PLAY_LISTING.md             # Store Listesi Metni
│   ├── SCREENSHOTS_GUIDE.md               # Screenshot Hazırlama
│   ├── RELEASE_APK_GUIDE.md               # APK İmzalama Rehberi
│   ├── TEST_GUIDE.md                      # Test ve Kullanım Rehberi
│   └── README.md                          # Bu dosya
│
├── build.gradle                           # Proje ayarları
├── settings.gradle                        # Gradle ayarları
├── gradle.properties                      # Gradle özellikleri
└── gradle/wrapper/gradle-wrapper.properties
```

---

## 🎯 İlk 5 Dakika

### 1️⃣ Android Studio'yu Açın
- https://developer.android.com/studio indir (eğer yoksa)
- Android Studio'yu başlat

### 2️⃣ Projeyi Aç
1. **File** → **Open**
2. **MySecurityApp_Complete** klasörünü seç
3. Android Studio projeyi yükleyecek (2-3 dakika)

### 3️⃣ Gradle Sync
- "Sync Now" butonu görünürse tıkla
- Bağımlılıklar indirilecek (internet gerekli)

### 4️⃣ Emülatör/Cihaz Hazırla
**Emülatör için:**
- Tools → Device Manager
- Yeni AVD oluştur (Pixel 4, Android 12+)

**Gerçek Cihaz için:**
- USB kablosunu tak
- Developer Mode'u aç (Ayarlar → Yazılım → Build numarasına 7 kez tıkla)

### 5️⃣ APK Oluştur ve Çalıştır
1. **Run** → **Run 'app'** seçin
2. Emülatör/cihazı seçin
3. Uygulama açılacak! 🎉

---

## 📱 APK OLUŞTURMA

### DEBUG APK (Test İçin) ⭐ EN KOLAY

```
Build → Build Bundle(s) / APK(s) → Build APK(s)
↓
Bitince: app/build/outputs/apk/debug/app-debug.apk
```

**Kurulum:**
```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

### RELEASE APK (Google Play İçin)

**ADIM 1: Key Oluştur**
```bash
keytool -genkey -v -keystore my-security-alarm.keystore \
  -keyalg RSA -keysize 2048 -validity 10000 -alias my_security
```

**ADIM 2: gradle.properties'e Ekle**
```properties
KEYSTORE_FILE=my-security-alarm.keystore
KEYSTORE_PASSWORD=your_password
KEY_ALIAS=my_security
KEY_PASSWORD=your_password
```

**ADIM 3: Build Et**
```
Build → Generate Signed Bundle / APK → APK → Finish
```

**Çıktı:**
```
app/build/outputs/apk/release/app-release.apk
```

---

## 📚 DOKÜMANTASYON REHBERI

### Google Play'e Yayınlamak İçin

1. **PRIVACY_POLICY.md** oku (zorunlu)
   - Google Play'de isteniyor
   - Gizlilik bildirisi hazır

2. **GOOGLE_PLAY_LISTING.md** oku
   - Store yazıları ve açıklamalar
   - SEO keywords
   - Content rating bilgileri

3. **SCREENSHOTS_GUIDE.md** oku
   - Screenshot nasıl alınır
   - Tasarım önerileri
   - Feature graphic hazırlama

4. **RELEASE_APK_GUIDE.md** oku
   - APK imzalama
   - Google Play Console'a yükleme
   - Yayınlama adımları

### Test ve Kullanım İçin

5. **TEST_GUIDE.md** oku
   - Kurulum adımları
   - Özellik testleri
   - Sorun giderme

---

## 🔧 TEKNIK ÖZELLIKLER

```
Uygulamanın Ayrıntıları:
┌─────────────────────────────────────┐
│ Paket Adı: com.mysecurity.alarm     │
│ Sürüm: 1.0.0                        │
│ Min Android: 7.0 (API 24)           │
│ Target Android: 13 (API 33)         │
│ Boyut: ~15 MB (release)             │
│ Programlama Dili: Kotlin/Java       │
│ Tema: Dark (Koyu tema)              │
│ Lisans: Proprietary                 │
└─────────────────────────────────────┘

İnternet İzinleri:
✓ INTERNET - Giriş portalı erişimi
✓ ACCESS_NETWORK_STATE - Ağ kontrolü

Kütüphaneler:
✓ AndroidX Core
✓ AppCompat
✓ Material Design
```

---

## 🔐 GÜVENLİK ÖNEMLİ NOTLAR

1. **KeyStore Dosyasını Saklayın**
   - Kaybederseniz uygulamayı güncelleyemezsiniz
   - Backup alın: `cp my-security-alarm.keystore ~/backup/`

2. **Şifrenizi Koruyun**
   - gradle.properties'i git ignore'a ekleyin
   - Şifreyi environment variable'da saklayın

3. **APK'ları Saklayın**
   - Her yayınlama için backup alın
   - Geri dönüş için önceki versiyonları saklayın

---

## 📞 İLETİŞİM BİLGİLERİ

**Destek:**
- Email: info@mysecurity.com.tr
- Telefon: 0850 532 0155
- Web: https://oim.alarmdc.com

**Kod Soruları İçin:**
- README.md'yi oku
- build.gradle'ı kontrol et
- Android Developer Docs: https://developer.android.com

---

## ❓ SSS (SAĞLANAN SORULAR)

**S: APK'yı nasıl test ederim?**
C: TEST_GUIDE.md'yi oku ve adımları izle.

**S: Google Play'a nasıl yüklerim?**
C: RELEASE_APK_GUIDE.md'yi oku. Tüm adımlar var.

**S: Logo neden görünmüyor?**
C: TEST_GUIDE.md → Sorun 2'yi kontrol et.

**S: APK dosyası nerede bulunur?**
C: `app/build/outputs/apk/` klasöründe. Format seçine göre değişir.

**S: Hangi Android sürümünü destekler?**
C: Android 7.0+ (API 24+)

**S: Çevrimdışı çalışabilir mi?**
C: Hayır. Giriş portalına internet bağlantısı gerekir.

---

## ✅ KONTROL LİSTESİ

### Geliştirme Aşaması
- [x] Proje yapısı hazır
- [x] MainActivity.kt hazır (Kotlin)
- [x] Logo entegre edilmiş
- [x] Gradle ayarları tamam
- [x] Tüm dokümantasyon hazır

### Yayınlamadan Önce
- [ ] DEBUG APK oluşturdun
- [ ] Test cihazında çalıştırdın
- [ ] Tüm butonları test ettin
- [ ] PRIVACY_POLICY.md okudum
- [ ] Google Play Console hesabı oluşturdum
- [ ] RELEASE_APK_GUIDE.md'yi izledim
- [ ] Release APK oluşturdum
- [ ] KeyStore dosyasını yedekledim
- [ ] Screenshots hazırladım
- [ ] Tüm metinleri kontrol ettim
- [ ] Google Play'e yükledim

---

## 🚀 SONRAKI ADIMLAR

1. **Şimdi:** DEBUG APK'yı test et
   ```
   Run → Run 'app'
   ```

2. **Sonra:** RELEASE_APK_GUIDE.md'yi oku

3. **En son:** GOOGLE_PLAY_LISTING.md'yi izle

---

## 📖 DOKÜMANTASYON DOSYALARI

| Dosya | Amaç | Kimi İçin |
|-------|------|----------|
| PRIVACY_POLICY.md | Gizlilik bildirisi | Google Play (Zorunlu) |
| GOOGLE_PLAY_LISTING.md | Store metin ve açıklamalar | Marketing/Yayın |
| SCREENSHOTS_GUIDE.md | Screenshot hazırlama | Marketing/Yayın |
| RELEASE_APK_GUIDE.md | İmzalı APK oluşturma | Teknik/Yayın |
| TEST_GUIDE.md | Test ve kullanım rehberi | QA/Kullanıcılar |
| README.md | Kurulum talimatları | Geliştirici |

---

## 🎓 ÖĞRENİM KAYNAKLARI

- Android Tutorials: https://developer.android.com/training
- Kotlin: https://kotlinlang.org/docs/
- Google Play: https://play.google.com/console/about/

---

**Hazırlandı:** Mart 2026
**Sürüm:** 1.0.0
**Durum:** YAYINA HAZIR ✅

**Sorularınız mı var? info@mysecurity.com.tr ile iletişime geçin.**
