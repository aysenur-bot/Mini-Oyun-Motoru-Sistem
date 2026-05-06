## Factory Method Pattern

### Nerede kullanıldı?
GameObjectFactory içinde nesne oluşturma merkezi hale getirildi.

### Neden kullanıldı?
- if-else zincirini kaldırmak
- nesne oluşturmayı merkezileştirmek
- Main class’ı sadeleştirmek

### Kazanım:
- Open/Closed Principle sağlandı
- Yeni obje eklemek kolaylaştı
- Kod okunabilirliği arttı.

## FAZ1

## Adapter Pattern

### Nerede kullanıldı?

EnemyAdapter sınıfı, ExternalEnemySystem'i mevcut GameObject hiyerarşisine entegre etmek için kullanıldı.

### Neden?
ExternalEnemySystem, GameObject yapısıyla uyumsuzdu.

### Kazanımlar
- eski sistem entegrasyonu
- uyumsuzluğun azalması
- daha iyi genişletilebilirlik

---

## Dekoratör Kalıbı

### Nerede kullanıldı?

ShieldDecorator, Player nesnelerine dinamik olarak yeni yetenekler ekler.

### Neden?
Player sınıfını değiştirmeden yeni özellikler eklenmesi gerekiyordu.

### Kazanımlar
- çalışma zamanı özellik genişletmesi
- daha iyi esneklik
- genişletmeye açık