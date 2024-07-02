//5 - Escreva uma classe que permite o usuário fazer as entradas e os cálculos
//necessários para saber o volume do Dodecaedro
public class DodecahedronVolumeFinder {
    public static double calculateVolume(double edgeLength) {
        double volume = ((15 + 7 * Math.sqrt(5)) / 4) * Math.pow(edgeLength, 3);
        return volume;
    }
}
