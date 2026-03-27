# My Security Alarm Center - Test Rehberi ve El Kitabı

## İçindekiler
1. [Test Ortamı Kurulumu](#test-ortamı-kurulumu)
2. [Başlangıç Rehberi](#başlangıç-rehberi)
3. [Temel Özellikler Testi](#temel-özellikler-testi)
4. [Sorun Giderme](#sorun-giderme)
5. [Eğitim Videoları](#eğitim-videoları)

---

## Test Ortamı Kurulumu

### Gereksinimler
- Android 7.0 (API 24) veya daha yeni bir cihaz
- İnternet bağlantısı (Wi-Fi veya Mobil Data)
- APK dosyası

### 1. APK Kurulum (Android Cihaza)

**Adım 1: Bilinmeyen Kaynaklar'ı Etkinleştir**
1. Ayarlar → Güvenlik ve Gizlilik
2. Bilinmeyen Kaynaklar'a izin ver
3. "Bu cihaz ve giriş profili" seçin

**Adım 2: APK Dosyasını Yükle**
1. APK dosyasını cihaza aktar
2. Dosya Yöneticisi'ni açın
3. APK dosyasına tıklayın
4. "Yükle" tıklayın
5. "Uygulamayı Aç" tıklayın

**Adım 3: İzinleri Onaylayın**
- İnternet İzni: **Evet**
- Ağ Durumu İzni: **Evet**

### 2. APK Kurulum (Emülatör)

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

---

## Başlangıç Rehberi

### İlk Başlatma

1. **Uygulamayı Açın**
   - Home Screen'de "My Security Alarm" ikonuna tıklayın

2. **Giriş Ekranını Görün**
   - My Security Alarm logonuz görünecek
   - "Giriş Portalına Git" butonu

3. **Giriş Portalına Erişin**
   - "Giriş Portalına Git" butonuna tıklayın
   - Web tarayıcısı açılacak
   - https://oim.alarmdc.com/Kullanici/Login adresine gidecek

4. **Kimlik Bilgileri ile Giriş Yapın**
   - Kullanıcı adınızı girin
   - Şifrenizi girin
   - "Giriş Yap" tıklayın

5. **Sistemi Kontrol Edin**
   - Sisteminizi arm/disarm edin
   - Cihaz durumunu izleyin
   - Durumları kontrol edin

### Ana Ekran Bölümleri

```
┌─────────────────────────────────┐
│   📱 My Security Alarm Logo     │  ← Uygulama Kimliği
├─────────────────────────────────┤
│                                 │
│   "Erişim için Giriş Yapın"    │  ← Başlık
│   "Güvenlik sistemine..."       │  ← Açıklama
│                                 │
│  ┌─────────────────────────┐    │
│  │  Giriş Portalına Git  │    │  ← Giriş Butonu
│  └─────────────────────────┘    │
│                                 │
│  📞 Acil Durum:                 │  ← Acil Numara
│     0850 532 0155               │
│                                 │
│  📧 İletişim:                   │  ← Email
│     info@mysecurity.com.tr      │
│                                 │
│  Sürüm 1.0.0                    │  ← Versiyon Bilgisi
└─────────────────────────────────┘
```

---

## Temel Özellikler Testi

### Test 1: Uygulamayı Açma

**Beklenen Sonuç:**
- Uygulama açılır
- Logo görünür
- Metin alanları okunabilir
- Butonlar tıklanabilir

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 2: Giriş Portalına Erişim

**Adımlar:**
1. "Giriş Portalına Git" butonuna tıklayın
2. Tarayıcı açılır
3. oim.alarmdc.com sayfası yüklensin

**Beklenen Sonuç:**
- Web tarayıcısı açılır
- Login sayfası yüklenir
- URL doğru: `https://oim.alarmdc.com/Kullanici/Login?ReturnUrl=%2f`

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 3: Acil Durum Numarasına Erişim

**Adımlar:**
1. "0850 532 0155" numarasına tıklayın
2. Arama uygulaması açılır

**Beklenen Sonuç:**
- Telefon uygulaması açılır
- Numara doldurulmuş: 0850 532 0155
- Arama yapmaya hazır

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 4: Email Gönderi

**Adımlar:**
1. "info@mysecurity.com.tr" adresine tıklayın
2. Email uygulaması açılır

**Beklenen Sonuç:**
- Email yazma uygulaması açılır
- Alıcı: info@mysecurity.com.tr
- Konu: "My Security Alarm - Destek Talep"

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 5: Uygulama Kapanması

**Adımlar:**
1. Geri Butonu'na basın
2. Uygulama kapanır

**Beklenen Sonuç:**
- Uygulama temiz bir şekilde kapanır
- Hata mesajı yoktur
- Home Screen'e dönülür

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 6: İnternet Yok Durumu

**Adımlar:**
1. İnternet bağlantısını devre dışı bırakın
2. "Giriş Portalına Git" butonuna tıklayın
3. Hata mesajı görünür

**Beklenen Sonuç:**
- Hata mesajı: "İnternet bağlantısı yok"
- Veya tarayıcıda error sayfası

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 7: Türkçe Dil Desteği

**Adımlar:**
1. Tüm metinleri okuyun
2. Hiçbir İngilizce metin olmamalı

**Beklenen Sonuç:**
- Tüm metinler Türkçe
- Doğru dilbilgisi
- Karakterler doğru görüntüleniyor

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 8: Ekran Yönelimi (Landscape/Portrait)

**Adımlar:**
1. Cihazı dikey modda tutun
2. Cihazı yatay modda tutun
3. Yeniden dikey yapın

**Beklenen Sonuç:**
- Arayüz her iki modda da düzgün görüntülenir
- Metin kesilmez
- Butonlar erişilebilir kalır

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 9: Performans

**Adımlar:**
1. Uygulamayı açın
2. Butonları çokça tıklayın
3. Arayüzde donma olup olmadığını kontrol edin

**Beklenen Sonuç:**
- Uygulama akıcı çalışır
- Hiçbir donma/lag yoktur
- Buton tıklamaları yanıt verir

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

### Test 10: Tarayıcı Geçişi

**Adımlar:**
1. "Giriş Portalına Git" tıklayın
2. Tarayıcıya gidin
3. Geri tuşuna basın
4. Uygulama açılır

**Beklenen Sonuç:**
- Tarayıcıdan uygulamaya döndüğünde crash olmaz
- Uygulama normal çalışır

**Test Sonucu:**
```
Başarılı ☑ / Başarısız ☐
Açıklama: _______________________
```

---

## Sorun Giderme

### Sorun 1: APK Yüklemesi Başarısız

**Hata:** "Kurulum başarısız"

**Çözüm:**
1. Cihazda "Bilinmeyen Kaynaklar"ı etkinleştirin
2. Yeterli depolama alanı olduğundan emin olun
3. APK dosyasını sıfırdan indirin
4. Eski sürümü silin, tekrar yükleyin

```bash
# Komut satırından:
adb uninstall com.mysecurity.alarm
adb install app-release.apk
```

---

### Sorun 2: Logo Görünmüyor

**Hata:** Uygulama logosu boş görünüyor

**Çözüm:**
1. Uygulamayı kapat ve açı
2. Cihazı yeniden başlat
3. Uygulamayı temiz kur (sil + yeniden yükle)

---

### Sorun 3: Giriş Portalı Açılmıyor

**Hata:** "Tarayıcı bulamadı" hataları

**Çözüm:**
1. Cihazda web tarayıcısı (Chrome, Firefox) yüklü olduğundan emin olun
2. İnternet bağlantısını kontrol edin
3. URL'i elle tarayıcıya yazın: https://oim.alarmdc.com

```
curl https://oim.alarmdc.com/Kullanici/Login
# 200 OK döndürmeli
```

---

### Sorun 4: Uygulama Çöküyor (Crash)

**Hata:** "Maalesef, My Security Alarm durdu"

**Çözüm:**
1. Logcat'i kontrol edin:
   ```bash
   adb logcat | grep FATAL
   ```
2. Uygulamayı güncelleyin
3. Cihaz belleğini temizleyin

---

### Sorun 5: Performans Sorunu

**Hata:** Uygulama yavaş/donuyor

**Çözüm:**
1. Arkaplan uygulamalarını kapatın
2. Cihazı yeniden başlatın
3. RAM'ı temizleyin
4. Uygulamayı yeniden yükleyin

---

## Eğitim Videoları

Aşağıdaki videoları YouTube'da hazırlanması önerilir:

### Video 1: Kurulum (2 dakika)
```
- APK indirme
- Kurulum adımları
- İzinler
- İlk başlatma
```

### Video 2: Kullanım (3 dakika)
```
- Uygulamayı açma
- Giriş portalına erişim
- Sistemi kontrol etme
- Acil durum çağrısı
```

### Video 3: Sorun Giderme (3 dakika)
```
- Yaygın sorunlar
- Çözüm adımları
- İletişim bilgileri
```

---

## Geribildirim Formu

Lütfen bu formu doldurup destek ekibine gönderin:

```
═══════════════════════════════════════════════════════════════
           MY SECURITY ALARM - GERİBİLDİRİM FORMU
═══════════════════════════════════════════════════════════════

Tarih: ___________________

Cihaz Bilgileri:
- Marka ve Model: _____________________________
- Android Sürümü: _____________________________
- RAM Miktarı: ________________________________

Test Sonuçları:
- Kurulum: Başarılı ☐ / Başarısız ☐
- Logo Görünümü: Başarılı ☐ / Başarısız ☐
- Giriş Erişimi: Başarılı ☐ / Başarısız ☐
- Acil Numarası: Başarılı ☐ / Başarısız ☐
- Email Gönderimi: Başarılı ☐ / Başarısız ☐

Sorunlar (varsa):
_________________________________________________________________
_________________________________________________________________
_________________________________________________________________

Öneriler:
_________________________________________________________________
_________________________________________________________________

Ad-Soyad: _______________________
Email: __________________________
Telefon: ________________________

═══════════════════════════════════════════════════════════════

Geri bildirim gönder: info@mysecurity.com.tr
```

---

## Destekle İletişim

Sorun yaşarsanız:

**Email:** info@mysecurity.com.tr
**Telefon:** 0850 532 0155
**Web:** https://oim.alarmdc.com
**Saat:** 24/7 Destek

**Destek Ekibine Yazarken:**
1. Cihaz modelinizi yazın
2. Android sürümünü yazın
3. Sorunu detaylı açıklayın
4. Ekran görüntüsü ekleyin
5. Logcat output gönderin (varsa)

---

**Son güncelleme:** Mart 2026
**Sürüm:** 1.0.0
