## Dördüncü hafta ödevi son teslim tarihi : 06.08.2021(Gelecek hafta pazartesi) - Saat =>  23:30

![homework](https://user-images.githubusercontent.com/45206582/131386439-6727321a-5a50-4c20-9413-ea4013013434.PNG)

---

# Okul Yönetim Sistemi

Gittigidiyor Java Spring bootcampi kapsamında yazılan Spring projesi.
Araştırmacı, Öğrenci, Kurs objelerini data basede kaydeder ve ilişkisini ayarlar kurar.

---
# Model
## Araştırmacı
Araştırmacılar, Misafir araştırmacı ve Daimi araştırmacı olarak ikiye ayrılır. Araştırmacıların sınıf yapıları
#### Misafir araştırmacı
|Parametrenin türü|Parametre ismi|
|--------|-------|
|String|İsim|
|String|Adres|
|Sayı|Telefon numarası|
|Kurs kümesi|Kayıtlı kursları|
|Sayı|Saatlik maaş|

#### Daimi araştırmacı
|Parametrenin türü|Parametre ismi|
|--------|-------|
|String|İsim|
|String|Adres|
|Sayı|Telefon numarası|
|Kurs kümesi|Kayıtlı kursları|
|Sayı|Aylık maaş|

## Öğrenci
Öğrenciler kurslara kayıtlı objelerdir.
|Parametrenin türü|Parametrenin ismi|
|------|------|
|String|İsim|
|Tarih|Doğum tarihi|
|String|Adres|
|String|Cinsiyet|
|Kurs kümesi|Kayıtlı kursları|

## Kurs
|Parametrenin türü|Parametre ismi|
|--------|-------|
|String|Kurs İsmi|
|String|Kurs Kodu|
|Sayı|Kredisi|
|Araştırmacı|Dersi veren araştırmacı|
|Öğrenci kümesi|Dersi alan öğrenciler|

---
# End pointler

## Araştırmacı end pointleri
* Tüm araştırmacıları çek
* Verilen id'deki araştırmacıyı çek
* Araştırmacı kaydet
* Verilen id'deki araştırmacıyı sil
* Verilen isimdeki araştırmacıyı sil
* En yüksek maaşlı araştırmacıları çek

## Öğrennci end pointleri
* Tüm öğrencileri çek
* Verilen id'deki öğrenciyi çek
* Öğrenci kaydet
* Verilen id'deki öğrenciyi sil
* Verilen isimdeki öğrenciyi sil
* Öğrencileri adrese göre grupla
* Öğrencileri cinsiyete göre grupla

## Kurs end pointleri
* Tüm kurslerı çek
* Verilen id'deki kurs çek
* Verilen kurs kodundan kursu çek
* Kurs kaydet
* Kurs güncelle
* Verilen id'deki kursu sil
* Verilen kurs kodundan kursu sil

## Hata end pointleri
* Tüm hataları çek
* Verilen id'deki hatayı çek
* Http status kodundan hatayı çek
* Verilen tarihler arasındaki hataları çek

## Test end pointi
* Verilen Araştırmacı, Öğrenci ve Kurs sayısı kadar obje oluştur, kaydet ve aralarında bağlantı oluştur
