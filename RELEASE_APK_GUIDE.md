# Release APK Oluşturma Rehberi

## Adım 1: KeyStore Dosyası Oluşturma

KeyStore, APK dosyasını imzalamak için kullanılan dijital sertifikadır.

### Android Studio ile:

1. **Build → Generate Signed Bundle / APK** seçin
2. **APK** seçeneğini işaretleyin
3. **Next** tıklayın

### Komut Satırı ile:

```bash
keytool -genkey -v -keystore my-security-alarm.keystore -keyalg RSA -keysize 2048 -validity 10000 -alias my_security_alias
```

**Bilgileri Doldur:**
```
Keystore Password (şifre):      my_secure_password_123
First and Last Name:            My Security Alarm Center
Organizational Unit:            Security Team
Organization:                   My Security Alarm
City or Locality:               Istanbul
State or Province Name:         Istanbul
Country Code:                   TR
```

**Çıktı:** `my-security-alarm.keystore` dosyası

> ⚠️ **ÖNEMLİ:** KeyStore dosyasını güvenli bir yere saklayın! 
> Kayıp olursa, uygulamayı güncelleme yapamezsiniz.

---

## Adım 2: gradle.properties'e KeyStore Bilgileri Ekleme

`gradle.properties` dosyasını açın ve şu satırları ekleyin:

```properties
# KeyStore Ayarları
KEYSTORE_FILE=my-security-alarm.keystore
KEYSTORE_PASSWORD=my_secure_password_123
KEY_ALIAS=my_security_alias
KEY_PASSWORD=my_secure_password_123
```

---

## Adım 3: build.gradle'ı Güncelleme

`app/build.gradle` dosyasını şu şekilde güncelleyin:

```gradle
android {
    compileSdkVersion 33
    
    defaultConfig {
        applicationId "com.mysecurity.alarm"
        minSdkVersion 24
        targetSdkVersion 33
        versionCode 1
        versionName "1.0.0"
        
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }
    
    signingConfigs {
        release {
            storeFile file(System.getenv("KEYSTORE_FILE") ?: "my-security-alarm.keystore")
            storePassword System.getenv("KEYSTORE_PASSWORD") ?: "my_secure_password_123"
            keyAlias System.getenv("KEY_ALIAS") ?: "my_security_alias"
            keyPassword System.getenv("KEY_PASSWORD") ?: "my_secure_password_123"
        }
    }
    
    buildTypes {
        release {
            minifyEnabled true
            shrinkResources true
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
            signingConfig signingConfigs.release
        }
        debug {
            minifyEnabled false
            signingConfig signingConfigs.release
        }
    }
    
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    
    kotlinOptions {
        jvmTarget = '1.8'
    }
}
```

---

## Adım 4: Android Studio'da Release APK Oluşturma

1. **Build → Generate Signed Bundle / APK** seçin
2. **APK** seçeneğini işaretleyin
3. **Next** tıklayın
4. **Create new...** tıklayın (keystore yoksa)
5. Bilgileri doldurun:
   - Key store path: `my-security-alarm.keystore`
   - Password: `my_secure_password_123`
   - Alias: `my_security_alias`
   - Valid years: `25` (veya daha fazla)
6. **OK** tıklayın
7. **Next** tıklayın
8. **Release** seçin
9. **Finish** tıklayın

**Çıktı Konumu:**
```
app/build/outputs/bundle/release/app-release.aab
```

---

## Adım 5: Komut Satırı ile Release APK Oluşturma

```bash
cd MySecurityApp_Complete
./gradlew bundleRelease
```

Veya Windows'ta:
```bash
gradlew.bat bundleRelease
```

---

## Adım 6: APK Dosyasının Konumu

```
app/build/outputs/apk/release/app-release.apk
```

---

## Adım 7: APK'yı Test Etme

### Cihaza Yüklemek:

```bash
adb install app/build/outputs/apk/release/app-release.apk
```

### Emülatörde Test:

```bash
adb -e install app/build/outputs/apk/release/app-release.apk
```

---

## Google Play Console Yayınlama Süreci

### 1. Google Play Developer Hesabı Oluşturun

- https://play.google.com/console adresine gidin
- Google hesabı ile giriş yapın
- Geliştirici kaydı olun (€ 25 / $ 25)

### 2. Yeni Uygulama Oluşturun

1. **Create App** tıklayın
2. Uygulama adını girin: `My Security Alarm Center`
3. **Türkçe** dili seçin
4. **Güvenlik** kategorisini seçin
5. Uygulamanın ücretsiz olduğunu onaylayın
6. **Create App** tıklayın

### 3. Uygulama Bilgilerini Doldurun

Sol menüde:
- **App Details** (Uygulama detayları)
- **Store Listing** (Mağaza Listesi)
- **Content Rating** (İçerik Derecesi)
- **Pricing & Distribution** (Fiyatlandırma)

### 4. Content Rating Formunu Doldurun

1. **Content Rating** → **Fill Form** tıklayın
2. Email girin: `info@mysecurity.com.tr`
3. Questionnaire'i doldurun:
   - Violence: No
   - Sexual content: No
   - Alcohol/Tobacco: No
   - Gambling: No
   - Save & Publish

### 5. Gizlilik Politikasını Ekleyin

1. **App Details** → **Privacy Policy**
2. URL girin:
   ```
   https://oim.alarmdc.com/privacy-policy
   ```
   (ya da lokal PDF yükleyin)

### 6. APK Yükleyin

1. **Release** → **Production** seçin
2. **Create new release** tıklayın
3. **Upload** kısmında imzalı APK'yı seçin
4. `app-release.apk` dosyasını yükleyin
5. **Review** bölümündeki notları doldurun
6. **Save** tıklayın

### 7. Son Kontrol

```
Kontrol Listesi:
☑ Tüm metin alanları dolu
☑ Screenshots yüklendi
☑ Icon yüklendi
☑ Feature graphic yüklendi
☑ Privacy Policy URL eklendi
☑ Content Rating tamamlandı
☑ APK imzalı ve yüklendi
☑ Test cihazlarında çalışıyor
☑ Uygulama adı aynı
☑ Açıklamalar kontrol edildi
```

### 8. Yayınlama Başvurusu

1. **Ready to publish** yazan bölümü görün
2. **Review and roll out** tıklayın
3. **Review Changes** tıklayın
4. Tüm öğelerin yeşil olduğunu kontrol edin
5. **Start rollout to Production** tıklayın
6. **Confirm** tıklayın

**İşlem süresi:** 2-4 saat (genellikle)

---

## Sürüm Güncellemeleri

Daha sonra güncelleme yapmak için:

1. `app/build.gradle`'da `versionCode` ve `versionName`'i artırın:
   ```gradle
   versionCode 2        // 1'den 2'ye
   versionName "1.0.1"  // 1.0.0'dan 1.0.1'e
   ```

2. Yeni release APK oluşturun
3. Google Play Console'da yeni release oluşturun
4. APK'yı yükleyin
5. Yayınlayın

---

## Sorun Giderme

**Hata: "Keystore file not found"**
```bash
# KeyStore dosyasını doğru konuma kopyalayın
cp my-security-alarm.keystore app/
```

**Hata: "Invalid keystore format"**
```bash
# KeyStore'u yeniden oluşturun
keytool -genkey -v -keystore my-security-alarm.keystore ...
```

**Hata: "Unsigned APK"**
```bash
# build.gradle'da signingConfig ayarını kontrol edin
```

**APK çok büyük:**
```gradle
# build.gradle'da minifyEnabled true olduğunu kontrol edin
```

---

## İmza Kontrolü

APK'nın imzalı olup olmadığını kontrol etmek:

```bash
jarsigner -verify -verbose app/build/outputs/apk/release/app-release.apk
```

Çıktı: `jar verified` demeli.

---

## Güvenlik İpuçları

1. **KeyStore Dosyasını Yedekleyin**
   ```bash
   cp my-security-alarm.keystore ~/backup/
   ```

2. **Şifrenin Nerede Depolandığını Kontrol Edin**
   - gradle.properties'i git ignore'a ekleyin
   - Şifreyi environment variable'da saklayın

3. **Düzenli Olarak Yedekleyin**
   ```bash
   tar -czf mysecurityapp-backup.tar.gz MySecurityApp_Complete/
   ```

---

**Notlar:**
- Her APK yayınlaması için farklı versionCode kullanın
- Geri dönüş yapmak için önceki sürümü yayınlayın
- Google Play'e yüklenen APK 32-bit ve 64-bit olmalı (ileri için)
- İlk yayınlama 2-4 saat sürebilir
