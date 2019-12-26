package ru.ssau.tk.prals.slizzz.preparationforthetest;

import java.lang.reflect.Method;

public class Methods {
    public static String[] getMethods(Object object) {
        Method[] containerMethods = object.getClass().getDeclaredMethods();
        String[] arrMethods = new String[containerMethods.length];
        int i = 0;
        for (Method method : containerMethods) {
            arrMethods[i++] = method.toString();
        }
        return arrMethods;
    }
}
