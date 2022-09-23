package ru.javarush.quest.repository;

import ru.javarush.quest.entities.GamePage;
import ru.javarush.quest.entities.GamePageCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GamePageRepository {
    private static final GamePageRepository pageRepository = new GamePageRepository();
    private static List<Integer> statistics = new ArrayList<>();

    public static GamePageRepository getPageRepository() {
        return pageRepository;
    }

    private Map<Integer, GamePage> storage = new HashMap<>() {
        {
            put(1, new GamePage(
                            "КОРРУПЦИЯ",
                            "Во время ареста Карлоса Лейдера, вам предлагают 500k чтобы вы дали ему 50 минут форы, ваши действия?",
                            new GamePageCard[]{
                                    new GamePageCard(
                                            "Больше колется, чем хочется",
                                            "Вам просто ненавистны барыги",
                                            "Вы отправляете Карлоса в Америку, за решетку, где он проведет остаток своей жизни.",
                                            true),
                                    new GamePageCard(
                                            "Легкие деньги",
                                            "Все равно далеко не уйдет",
                                            "Пока никто не видит вы снимаете наручники и отпускаете задержанного",
                                            false)
                            }
                    )
            );
            put(2, new GamePage(
                            "СОБЛАЗН",
                            "При облаве на кокаиновую лабу обнаружилась тонна-другая готового товара. Кило можно и скроить?",

                            new GamePageCard[]{
                                    new GamePageCard(
                                            "Одним больше/меньше - без разницы.",
                                            "В такой куче никто и не заметит",
                                            "Аккуратно в рюкзачок, на черный день, вы кладете пару кило из конфиската.",
                                            false),
                                    new GamePageCard(
                                            "Я не такой.",
                                            "Статья, тюрьма, все дела",
                                            "Поливаете весь конфисат бензином и сжигаете.",
                                            true)
                            }
                    )
            );
            put(3, new GamePage(
                            "ЭЙФОРИЯ",
                            "Вечер. Паб. Пиво с орешками, дорогое пойло в компании осведомителя из картеля Кали. " +
                                    " Есть предложение попробовать то, что ты недавно сжигал тоннами.",

                            new GamePageCard[]{
                                    new GamePageCard(
                                            "Почему бы и нет.",
                                            "Привыкание эта дрянь вызывает только у каждого 4-го",
                                            "Соглашаетесь в качестве исключения, да и в целом обстановка располагает...",
                                            true),
                                    new GamePageCard(
                                            "Опять же я не такой.",
                                            "Занудная зануда. С тобой каши не сваришь.",
                                            "Отказываетесь с отмазкой : -Завтра на работу.",
                                            true)
                            }
                    )
            );
            put(4, new GamePage(
                            "ОТРЯД САМОУБИЙЦ",
                            "Стало известно метонахождение члена картеля Хосе Гонсало Родригеса Гача." +
                                    " Всем известно, что он своего рода министр обороны картеля, голыми руками не возьмешь." +
                                    " Вы в деле?",

                            new GamePageCard[]{
                                    new GamePageCard(
                                            "Это ГАЧА!!! Вот это удача!",
                                            "Похвалят, оценят, наградят.",
                                            "Да, я в деле. Хватаете пистолет и бегом по машинам." +
                                                    "Хотя недавно опохмелились.",
                                            false),
                                    new GamePageCard(
                                            "Хммм, можно и пулю словить.",
                                            "Может пусть его берет местная полиция, ну да ладно.",
                                            "Полная экипировка, бронежилет. Вызываете вертолет и летите в качестве подстраховки," +
                                                    " на случай если Гача соберется удирать.",
                                            true)
                            }
                    )
            );
            put(5, new GamePage(
                            "Крот",
                            "Барыги предложили вам немалые деньги в обмен на информацию об облавах на их лаборатории." +
                                    " Согласитесь?",

                            new GamePageCard[]{
                                    new GamePageCard(
                                            "Пенсия обеспечена.",
                                            "Все равно вех не пересажаем.",
                                            "Соглашаетесь и открываете счет в банке потирая руки.",
                                            false),
                                    new GamePageCard(
                                            "Это верх наглости.",
                                            "Предложить агенту УБН такое?",
                                            "Достаете пистолет и растреиваете парламентеров.",
                                            true)
                            }
                    )
            );
        }
    };

    public GamePage getGamePage(Integer id) {
        GamePage page = null;
        for (Map.Entry<Integer, GamePage> entry : storage.entrySet()) {
            if (entry.getKey() == id) {
                page = entry.getValue();
            }
        }
        return page;
    }

    public int getNextIndex(int currentIndex, GamePageCard card) {
        return card.result ? currentIndex + 1 : 0;
    }

    public List<Integer> getStatistics(){
        return statistics;
    }

    public int getStorageSize() {
        return storage.size();
    }
}
