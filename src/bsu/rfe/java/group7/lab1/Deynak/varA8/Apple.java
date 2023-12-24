package bsu.rfe.java.group7.lab1.Deynak.varA8;

public class Apple extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;
    public Apple(String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Яблоко");
// Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple)arg0).size); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    //Итак, выражение return super.toString() + " размера '" + size.toUpperCase() + "'"; возвращает строку,
    // представляющую название продукта (полученное из метода toString() родительского класса) и размер яблока в верхнем регистре, заключенный в кавычки.
    // Это позволяет получить полное описание яблока, включающее его название и размер, при вызове метода toString() для объекта класса Apple.
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
