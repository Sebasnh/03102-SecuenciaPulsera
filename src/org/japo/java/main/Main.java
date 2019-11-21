/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {

        final String NOMBRE = "Marta";
        final double D_INICIAL = 1.00;
        final String ARTICULO = "Pulsera hippy";
        final double P_ARTICULO = 0.70;

        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");

        System.out.printf("Nombre de la niña ...: %s%n", NOMBRE);
        System.out.printf(Locale.ENGLISH,"Dinero inicial ......: %.2f €%n", D_INICIAL);

        System.out.println("---");

        System.out.printf("Artículo a comprar ..: %s%n", ARTICULO);
        System.out.printf(Locale.ENGLISH, "Precio artículo .....: %.2f €%n", P_ARTICULO);

        System.out.println("---");

        double dRestante = D_INICIAL - P_ARTICULO;

        System.out.printf(Locale.ENGLISH,"Dinero restante .....: %.2f €%n", dRestante);

    }

}
