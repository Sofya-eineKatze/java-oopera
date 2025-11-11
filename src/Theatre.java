import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // 1. Создаем трех актеров
        System.out.println("1. Создаем актеров:");
        Actor actor1 = new Actor("Анна", "Иванова", Gender.FEMALE, 165);
        Actor actor2 = new Actor("Сидр", "Сидоров", Gender.MALE, 180);
        Actor actor3 = new Actor("Оксана", "Кузнецова", Gender.FEMALE, 170);

        System.out.println("   - " + actor1);
        System.out.println("   - " + actor2);
        System.out.println("   - " + actor3);

        // 2. Создаем режиссеров
        System.out.println("\n2. Создаем режиссеров:");
        Director director1 = new Director("Федор", "Бондарчук", Gender.MALE, 12);
        Director director2 = new Director("Татьяна", "Орлова", Gender.FEMALE, 7);

        System.out.println("   - " + director1);
        System.out.println("   - " + director2);

        // 3. Создаем автора музыки и хореографа
        System.out.println("\n3. Создаем других участников:");
        String musicAuthor = "Джузеппе Верди";
        String choreographer = "Морис Бежар";

        System.out.println("   - Автор музыки: " + musicAuthor);
        System.out.println("   - Хореограф: " + choreographer);

        // 4. Создаем спектакли с пустыми списками актеров
        System.out.println("\n4. Создаем спектакли:");

        // Обычный спектакль - "Ревизор" Гоголя
        Show regularShow = new Show("Ревизор", 140, director1, new ArrayList<>());
        System.out.println("   - Обычный спектакль: '" + regularShow.title + "'");

        // Оперный спектакль - "Травиата" Верди
        Opera opera = new Opera("Травиата", 160, director1, new ArrayList<>(),
                musicAuthor, "Опера в трёх действиях по драме А. Дюма-сына «Дама с камелиями».", 20);
        System.out.println("   - Опера: '" + opera.title + "'");

        // Балетный спектакль - "Жизель" Адана
        Ballet ballet = new Ballet("Жизель", 130, director2, new ArrayList<>(),
                "Адольф Адан", "Балет в двух актах о трагической любви крестьянской девушки.",
                choreographer);
        System.out.println("   - Балет: '" + ballet.title + "'");

        // 5. Распределяем актеров по спектаклям
        System.out.println("\n5. Распределяем актеров по спектаклям:");

        // В обычный спектакль добавляем всех актеров
        System.out.println("\n   В обычный спектакль 'Ревизор':");
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        regularShow.addActor(actor3);

        // В оперу добавляем двух актеров
        System.out.println("\n   В оперу 'Травиата':");
        opera.addActor(actor1);
        opera.addActor(actor2);

        // В балет добавляем одного актера
        System.out.println("\n   В балет 'Жизель':");
        ballet.addActor(actor3);

        // 6. Выводим списки актеров для каждого спектакля
        System.out.println("\n6. Списки актеров в спектаклях:");

        System.out.println("\n   Обычный спектакль 'Ревизор':");
        regularShow.printActors();

        System.out.println("\n   Опера 'Травиата':");
        opera.printActors();

        System.out.println("\n   Балет 'Жизель':");
        ballet.printActors();

        // 7. Заменяем актера в одном из спектаклей
        System.out.println("\n7. Заменяем актера в опере 'Травиата':");
        Actor newActor = new Actor("Андрей", "Семенов", Gender.MALE, 182);
        opera.replaceActor("Иванов", newActor);

        System.out.println("\n   Обновленный список актеров в опере 'Травиата':");
        opera.printActors();

        // 8. Несуществующий актер
        System.out.println("\n8. Несуществующий актер в балете 'Жизель':");
        ballet.replaceActor("Петров", newActor);

        // 9. Выводим либретто для оперного и балетного спектаклей
        System.out.println("\n9. Либретто музыкальных спектаклей:");

        System.out.println("\n   Либретто оперы 'Травиата':");
        opera.printLibretto();

        System.out.println("\n   Либретто балета 'Жизель':");
        ballet.printLibretto();

        // 10. Демонстрация информации о режиссерах
        System.out.println("\n10. Информация о режиссерах спектаклей:");

        System.out.println("\n   Обычный спектакль 'Ревизор' и опера 'Травиата':");
        regularShow.printDirectorInfo();

        System.out.println("\n   Балет 'Жизель':");
        ballet.printDirectorInfo();

        System.out.println("\nПРЕДСТАВЛЕНИЕ НАЧИНАЕТСЯ!");
    }
}