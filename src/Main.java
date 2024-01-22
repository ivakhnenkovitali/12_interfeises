import Interfaces.ISwim;
import Interfaces.IVoice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Fish("Goldi", Color.RED);
        Pet pet2 = new Dog("Rex", Color.BLACK);
        Pet pet3 = new British("Murzik", Color.WHITE);

        pet1.eat();
        pet2.eat();


        ///невозможно создать объет интерфейса (можно воспользоваться ананимным класом)
        //// IVoice iVoice = new  IVoice();

        //// в переменных интерфейса можно хранить объеты класса реализующих этот интерфейс
        IVoice voice1 = (IVoice) pet2;
        voice1.voce();

        System.out.println("------------------------------");

        Pet[] pets = {

                new Fish("Goldi", Color.RED),
                new Dog("Rex", Color.BLACK),
                new British("Murzik", Color.WHITE),
                new Norway("Bars", Color.WHITE),
                new MCune("Barsik", Color.COLOURFUL),
                new Fish("Star", Color.GRAY),
                new Dog("Barbos", Color.WHITE)


        };

        ///////    2.12 ================================


        System.out.println("вывод всех животных и они кушают");
        for (Pet pet : pets) {
            System.out.println(pet);
            pet.eat();
        }


        //////    2.13  ===================================


        IVoice[] voices = new IVoice[pets.length];
        int index = 0;

        ////собираем в отдельный моссивв только живаотных которые могут издовать голос

        for (Pet pet : pets) {

            ////// если текущее животное умеет издовать голос

            if (pet instanceof IVoice)
                voices[index++] = (IVoice) pet;

        }
        voices = Arrays.copyOf(voices, index);
        System.out.println("Животные издают голос:");
        for (IVoice pet : voices) {
            ///  System.out.println(pet);
            pet.voce();
        }

        ///// 2.14   ==============================
        System.out.println("Кушают только коты");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                pet.eat();
            }
        }

/////2.15 ===============как плавают только рыбки  ======

        System.out.println(" плавают  рыбки и тонут туристы");
        for (Pet pet : pets) {
            if (pet instanceof Fish) {             /////Fish -плавают только рыбки
                pet.eat();
            }
        }

        /////2.16 ========== как издают голос все животные

        System.out.println("животные издают голос (звук)");
        for (Pet pet : pets) {

            /////


            if (pet instanceof IVoice) {       ///// IVoice  -издают ввввсе голос
                ((IVoice) pet).voce(); ////v.voice()
            }

        }


        /// 2.17   ====== все животные каторые плавают

        System.out.println("Животные плавают");
        for (Pet pet : pets) {
            if (pet instanceof ISwim) {
                ((ISwim) pet).swim();
            }
        }

        ///////  2.18 =======коты плавают

        System.out.println("Коты плавают ");
        for (Pet pet : pets) {
            if (pet instanceof Cat && pet instanceof ISwim) {
                ((ISwim) pet).swim();
            }
        }


        ////// 2.19 ======= самый распрастранненный цвет  среди всех питомцев


        int[] colorCounters = new int[Color.values().length];
        for (Pet pet : pets) {
            colorCounters[pet.getColor().ordinal()]++;


        }
        int indPopularColor = 0, maxPopularColor = colorCounters[0];
        for (int i = 1; i < colorCounters.length; i++) {
            if (colorCounters[i] > maxPopularColor){
                maxPopularColor = colorCounters[i];
                    indPopularColor = i;
                }
            }
        System.out.println("самый популярный цвет: "+ Color.values()[indPopularColor]);
        }



    }








//  System.out.println("Самый распрастранненый цвет среди всех питомцев - WHITE- ");
/// for (Pet pet : pets) {

//
///   if (pet instanceof IVoice) {
///  ((IVoice) pet).voce();
///  }


///  }

///// 2.20 ====== самый распространенный цвет среди кошек


///  System.out.println("Самый распространненый цвет среди кошек -WHITE- ");
///   for (Pet pet : pets) {
///    if (pet instanceof Cat) {
///   pet.eat();
///  }
///  }


//}
///}








