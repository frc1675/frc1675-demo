// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.epilogue.Logged;

/* @Something is an annotation that causes "magic" to happen in the background
 * without having to write custom code. This specific annotation writes values
 * from Counter to the network tables, allowing them to appear on the robot
 * simulator and other tools we use.
 */
@Logged
// Counter is a class, which is like a blueprint that describes what a counter does.
public class Counter {
  /* This is one way of making a variable.
   * public -> access modifier. For now, we can make everything public
   * String / int -> The type of the variable. "String" is freeform text, and int is
   *   a non-decimal number
   * mySecondVariable / count -> The variable name. This can be anything, but make it
   *   make sense
   * = "Gobblety gook" / = 0 -> An "assignment." Whatever that's on the right side of
   *   the equal sign becomes the value of the variable. This must match the type.
   */
  public String mySecondVariable = "Gobblety gook";
  public int count = 0;

  /* This is a method. They do things. incrementAmount is a parameter. It's like a
   * variable, but allows the place calling the method to define the value
   */
  public void increment(int incrementAmount) {
    /* if only runs if the stuff in parentheses is TRUE. In this case, the code inside
     * the {} brackets only run if the variable, count, has a value less than 6.
     */
    if (count < 6) {
      /* This is another assignment. Now, we are changing the value of count to itself
       * PLUS whatever was passed into incrementAmount.
       */
      count = count + incrementAmount;
    }
  }
}
