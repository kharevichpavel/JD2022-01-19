/*
Создайте функцию, которая возвращает имя победителя в схватке между двумя бойцами.

Каждый боец ​​по очереди атакует другого, и побеждает тот, кто убьет другого первым. Смерть определяется как наличие health <= 0.

Каждый боец ​​будет Fighterобъектом/экземпляром. См. класс бойца ниже на выбранном вами языке.

Оба healthи damagePerAttack( damage_per_attackдля python) будут целыми числами больше, чем 0. Вы можете мутировать Fighterобъекты.

Пример:
  declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"

  Lew attacks Harry; Harry now has 3 health.
  Harry attacks Lew; Lew now has 6 health.
  Lew attacks Harry; Harry now has 1 health.
  Harry attacks Lew; Lew now has 2 health.
  Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
 */
package by.it.kharevich.codewars;

public class Task24 {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        fighter1.name="ww";
        fighter2.name="xx";
        int x = (int) (Math.random());
        if (x==1){
            firstAttacker=fighter1.name;
        }else{
            firstAttacker=fighter2.name;
        }
        System.out.println(firstAttacker);
        return firstAttacker;
    }

    public static void main(String[] args) {
        System.out.println();

    }
}
