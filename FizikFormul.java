/*
 * Ad Soyad: [HAYRUNNİSA EKİNCİ]
 * Ogrenci No: [240541043]
 * Tarih: [10/11/2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        // v = mesafe / zaman
        return distance/time; // Degistirin
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        // a = hiz degisimi / zaman
        return velocityChange/time; // Degistirin
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        return mass*acceleration; // Degistirin
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        // W = kuvvet * mesafe
        return force*distance; // Degistirin
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        // P = is / zaman
        return work/time; // Degistirin
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        // KE = 0.5 * kutle * (hiz * hiz)
        // Math.pow(velocity, 2) kullanabilirsiniz
        return 0.5*mass*Math.pow(velocity,2); // Degistirin
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // PE = kutle * yercekimi * yukseklik
        return mass*gravity*height; // Degistirin
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        // p = kutle * hiz
        return mass*velocity; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();

        // TEMEL OLCUMLER
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
        // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
        // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
        // 4. Is (W) hesaplanmali (Guc icin gerekli)
        // ... digerlerini hesaplayin


        //HIZ VE HAREKET HESAPLAMA
        double velocity= calculateVelocity(distance,time);
        double acceleration= calculateAcceleration(deltaV,time);

        //KUVVET VE İŞ HESAPLAMA
        double force= calculateForce(mass,acceleration);
        double work= calculateWork(force,distance);
        double power= calculatePower(work,time);

        //ENERJİ HESAPLAMA
        double kineticEnergy= calculateKineticEnergy(mass,velocity);
        double potentialEnergy= calculatePotentialEnergy(mass,GRAVITY,height);

        //MOMENTUM HESAPLAMA
        double momentum= calculateMomentum(mass,velocity);


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy));

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}
