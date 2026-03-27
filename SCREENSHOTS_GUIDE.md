# Google Play Store Screenshots Rehberi

## Gereksinimler

- **Format:** PNG veya JPG
- **Minimum Boyut:** 320x569px
- **Maksimum Boyut:** 3840x2160px
- **Önerilen Boyut:** 1080x1920px (9:16 aspect ratio)
- **Minimum 2, Maksimum 8 Screenshot**
- **Dil:** Türkçe

---

## Screenshot Hazırlanması

### Seçenek 1: Emülatörden Almak (En Kolay)

1. **Android Studio'da Emülatör Başlatın**
   ```
   - Bir Android Virtual Device (AVD) oluşturun
   - API Level 30+ (Android 11+) seçin
   - Telefon modeli: Pixel 4 veya Pixel 5
   ```

2. **Uygulamayı Emülatörde Çalıştırın**
   ```
   - Run → Run 'app' seçin
   - Emülatörde uygulamayı açın
   ```

3. **Screenshot Alın**
   - Emülatörde: Ctrl+S (Windows) veya Cmd+S (Mac)
   - Veya: Emülatör araç çubuğundan kamera ikonu

4. **Dosyayı Kaydedin**
   - Android Studio otomatik olarak `Pictures` klasörüne kaydeder

### Seçenek 2: Gerçek Cihazdan

1. **Cihazda USB Debugging Etkinleştirin**
   - Ayarlar → Yazılım hakkında → Yapı numarasına 7 kez tıklayın
   - Ayarlar → Geliştirici Seçenekleri → USB Debugging

2. **Bilgisayara Bağlayın**

3. **ADB ile Screenshot Alın**
   ```bash
   adb shell screencap -p /sdcard/screenshot.png
   adb pull /sdcard/screenshot.png
   ```

---

## Screenshot Metinleri (Türkçe Başlıkları Ekleme)

Adobe Photoshop, GIMP veya Canva kullanarak başlıkları ekleyin:

### Screenshot 1: Giriş Ekranı
```
Başlık: "Sistemi Kontrol Edin"
Alt Metin: "My Security Alarm Center mobil uygulaması ile 
güvenlik sisteminizi her yerden yönetin"

Yazı Tipi: Kalın, 48pt
Renk: Beyaz (#FFFFFF)
Konum: Ekranın üst ortası
Arka Plan: Hafif gölge (siyah transparanı)
```

### Screenshot 2: Portal Erişimi
```
Başlık: "Güvenli Giriş"
Alt Metin: "Şifreli bağlantı ile güvenli erişim"

Yazı Tipi: Kalın, 48pt
Renk: Cyan (#00ffc8)
Konum: Ekranın üst ortası
Arka Plan: Siyah yarı-transparent
```

### Screenshot 3: 24/7 Destek
```
Başlık: "Acil Destek"
Alt Metin: "0850 532 0155
info@mysecurity.com.tr"

Yazı Tipi: Normal, 36pt
Renk: Beyaz (#FFFFFF)
Konum: Ekranın ortası
Arka Plan: Siyah
```

---

## Canva ile Kolayca Hazırlamak

1. **Canva.com'a Gidin**
2. **Yeni Tasarım → "Instagram Story" seçin**
   (1080x1920px - aynı oranda)
3. **Marketplace'den "Mobile App Screenshot" template seçin**
4. **Aşağıdaki ögeler ekleyin:**
   - My Security Logo (sağ üst köşe)
   - Başlık metni
   - Açıklama
   - Renkler: Siyah (#0f1419), Cyan (#00ffc8)
5. **PNG olarak İndir**

---

## Önerilen 4 Screenshot Sırası

**Screenshot 1 (Kapak)**
- Logo merkezde
- "My Security Alarm Center" yazısı
- "Sistemi kontrol edin" alt başlığı
- Arka plan: Koyu gradyan

**Screenshot 2 (Özellikler)**
- Beş özellik listesi:
  ✓ Sistem Kontrolü
  ✓ 24/7 Durum İzlemesi
  ✓ Acil Destek
  ✓ Hızlı Erişim
  ✓ Güvenli Şifreleme

**Screenshot 3 (Güvenlik)**
- "Güvenli Bağlantı" başlığı
- Kilit ikonu
- "HTTPS Şifrelenmiş" yazısı
- "Veritabanınız Korunuyor" alt metin

**Screenshot 4 (İletişim)**
- "24/7 Destek Hattı" başlığı
- 0850 532 0155 (büyük yazı)
- info@mysecurity.com.tr (orta yazı)
- "Lütfen Arayınız" (uyarı)

---

## Renk Paleti

```
Arka Plan: #0f1419 (Çok Koyu Gri)
Accent: #00ffc8 (Neon Cyan)
Metin Birincil: #FFFFFF (Beyaz)
Metin İkincil: #99FFFFFF (Yarı Saydam Beyaz)
Vurgu: #FF4444 (Kırmızı - acil durumlar için)
```

---

## Text Özellikleri

```
Başlık Yazı Tipi: Montserrat Bold veya Inter Bold
Başlık Boyutu: 44-54pt
Başlık Rengi: #FFFFFF veya #00ffc8

Alt Yazı Tipi: Open Sans Regular
Alt Yazı Boyutu: 20-28pt
Alt Yazı Renği: #99FFFFFF

Minimum Padding: 40px (tüm taraflardan)
```

---

## Feature Graphic (1024x500px)

Bu grafik, Google Play Store'da uygulamanızın üst kısmında görünür.

**Tasarım:**
```
Sol Taraf (512x500):
- My Security Logo (merkezde, 300x300)
- Arka plan: Koyu mavi gradyan

Sağ Taraf (512x500):
- "My Security Alarm Center"
- "Güvenlik Sistemi Kontrolü"
- Arka plan: Neon efektleri
```

**Dosya Adı:** `feature_graphic_1024x500.png`

---

## Hazırlanacak Dosyalar Listesi

```
Google Play Store İçin:
□ screenshot_1.png (1080x1920)
□ screenshot_2.png (1080x1920)
□ screenshot_3.png (1080x1920)
□ screenshot_4.png (1080x1920) - isteğe bağlı
□ feature_graphic.png (1024x500)
□ app_icon.png (512x512) - hazır (logo.png)
□ app_icon_round.png (512x512) - hazır
```

---

## Hızlı Şablon (Copy-Paste İçin)

İhtiyaçlarınıza göre özelleştirin:

```
SCREENSHOT 1 - KAPAK
═══════════════════════════════════════════════════════════
Başlık: "Sistemi Kontrol Edin"
İçerik: Merkezde My Security Logo (300x300)
Alt Metin: "My Security Alarm Center - Güvenlik Sistemi Kontrolü"
Arka Plan: Koyu siyah (#0f1419)
Efekt: Neon parıltısı (Cyan)
═══════════════════════════════════════════════════════════

SCREENSHOT 2 - ÖZELLİKLER
═══════════════════════════════════════════════════════════
Başlık: "Neler Yapabilirsiniz?"
Listeler:
✓ Sistemi Kontrol Edin (Arm/Disarm)
✓ Cihaz Durumunu İzleyin
✓ Acil Destek Çağırın
✓ Hızlı Erişim
✓ Güvenli Şifreleme
═══════════════════════════════════════════════════════════

SCREENSHOT 3 - GÜVENLİK
═══════════════════════════════════════════════════════════
Başlık: "Güvenliğiniz Önceliğimiz"
Açıklama:
🔒 HTTPS Şifrelenmiş
🛡️ Güvenli Sunucular
✓ GDPR Uyumlu
Arka Plan: Siyah + Kilit ikonu
═══════════════════════════════════════════════════════════

SCREENSHOT 4 - İLETİŞİM
═══════════════════════════════════════════════════════════
Başlık: "24/7 Destek"
İçerik:
📞 0850 532 0155
📧 info@mysecurity.com.tr
Web: oim.alarmdc.com
═══════════════════════════════════════════════════════════
```

---

## Kontrol Listesi

- [ ] Tüm screenshotlar 1080x1920px
- [ ] PNG formatında
- [ ] Türkçe yazılar
- [ ] Logo görünüyor
- [ ] Metin okunabilir
- [ ] Renkler uyumlu
- [ ] En az 2 screenshot
- [ ] Maksimum 8 screenshot
- [ ] Feature graphic hazır (1024x500)
- [ ] Dosya adları açık
- [ ] Yüksek kalite (JPEG ~85% quality)

---

Görselleri hazırladıktan sonra, Google Play Console'da karşılık gelen alanlara yükleyin.
