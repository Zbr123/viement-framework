package step_defination.web;

import pages.Page;

import java.util.Random;

public class RandomGenerator extends Page {
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);

}