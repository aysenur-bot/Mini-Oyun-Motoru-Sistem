# Mini Oyun Motoru Sistem

## Seçilen Konu: C - Mini Oyun Motoru

Mini oyun motoru konusunu seçtim çünkü oyun nesneleri başlangıçta tek tip mantıkla yönetiliyor ve davranış farklılıkları if-else bloklarıyla ayrılıyor. 
Bu yapı büyüdükçe bakım zorlaşıyor ve yeni özellik eklemek mevcut kodu değiştirmeyi gerektiriyor. 
Bu nedenle design pattern uygulamaları için uygun bir örnek oluşturuyor.


# Mini Oyun Motoru

## Ne İşe Yarar?

Java'da tasarım kalıplarını gösteren basit bir oyun motoru.

## Kullanılan Tasarım Kalıpları

### Oluşturma
- Fabrika Metodu: Nesne oluşturma merkezileştirilmiş

### Yapısal
- Adaptör: Harici düşman entegrasyonu
- Dekoratör: Çalışma zamanında oyuncu yükseltmeleri

### Davranışsal
- Strateji: Oyuncu saldırı davranışı dinamik olarak değişir
- Gözlemci: Oyun güncellemeleri için olay sistemi

![Mini Game Engine UML](docs/ai-log/diagrams/Faz3.png)

## Nasıl Çalıştırılır
```bash
javac src/*.java
java Main