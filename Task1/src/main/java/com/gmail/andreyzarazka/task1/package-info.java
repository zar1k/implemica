/**
 * Если мы из корректно записанного арифметического выражения, содержащего числа, знаки операций и открывающие и
 * закрывающие круглые скобки выбросим числа и знаки операций, а затем запишем оставшиеся в выражении скобки без пробелов
 * между ними, то полученный результат назовем правильным скобочным выражением [скобочное выражение "(()(()))" - правильное,
 * а "()(" и "())(" - нет]. Найти число правильных скобочных выражений, содержащих N открывающихся и N закрывающихся
 * скобок. N вводится с клавиатуры. N неотрицательное целое число.
 * <p>
 * Пример:
 * N =  1 (по одной скобке открывающейся и закрывающейся) - ответ 1
 * ()
 * )(
 * ))
 * ((
 * Только один правильный вариант
 * <p>
 * Для введенного числа 2 - 2 :
 * ()()
 * (())
 * То есть только два варианта, когда все открытые скобки правильно открываются/закрываются.
 * И так далее.
 */
package com.gmail.andreyzarazka.task1;