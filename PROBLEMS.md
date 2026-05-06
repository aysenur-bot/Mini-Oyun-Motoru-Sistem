# PROBLEMS.md

## Başlangıç Kod Analizi

### 1. if-else bağımlılığı
Oyun nesnesi davranışları string karşılaştırmaları ile belirleniyor.
Yeni nesne tipi eklendiğinde update() metodunun değiştirilmesi gerekiyor.

### 2. Open/Closed Principle ihlali
Kod genişlemeye kapalıdır.
Yeni özellik eklemek için mevcut sınıf değiştirilmek zorundadır.

### 3. Tek sorumluluk ilkesine aykırı
GameObject hem nesne verisini tutuyor hem de davranış kontrolü yapıyor.

### 4. String tabanlı tip kontrolü
"player", "enemy" gibi stringler hata yapmaya açıktır.
Yanlış yazım durumunda sistem bozulabilir.

### 5. Nesne oluşturma merkezi değil
Nesneler doğrudan constructor ile oluşturuluyor.
Oluşturma mantığı ayrı bir katmanda yönetilmiyor.

---

## AI Analizi ile Karşılaştırma

### AI'ın gördüğü problemler
- Factory Method ihtiyacı
- Strategy pattern ihtiyacı
- if-else code smell
- OCP ihlali
- düşük esneklik

### Benim gördüğüm problemler
- if-else bağımlılığı
- string type kontrolü
- merkezi olmayan nesne oluşturma
- OCP ihlali
- SRP ihlali

### Farklar
AI özellikle Strategy pattern önerdi.
Ben başlangıçta daha çok nesne oluşturma ve kod tekrarına odaklandım.
AI daha çok çözüm (pattern önerileri) odaklı yaklaşırken, ben daha çok kodun yapısal problemlerine odaklandım.