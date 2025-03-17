📌 Përshkrimi

Ky program ofron funksione të ndryshme për punën me matrica, si:

Krijimi i matricës me input nga përdoruesi

Llogaritja e shumës dhe mesatares së elementeve

Gjetja e vlerës maksimale dhe minimale

📂 Funksionalitetet

Metoda

Përshkrimi

krijimi_i_matrices(int a, int b) -> Krijon një matricë me madhësi a × b duke marrë input nga përdoruesi.

shuma_e_matrices(int[][] a) -> Kthen shumën e të gjithë elementeve të matricës.

mesatarja_e_matrices(int[][] a) -> Kthen mesataren e vlerave të matricës.

maksimalja_e_matrices(int[][] a) -> Gjen vlerën maksimale në matricë.

minimalja_e_matrices(int[][] a) -> Gjen vlerën minimale në matricë.

⚡ Përdorimi

int[][] matrica = Matricat.krijimi_i_matrices(3, 3);
System.out.println("Shuma: " + Matricat.shuma_e_matrices(matrica));
System.out.println("Mesatarja: " + Matricat.mesatarja_e_matrices(matrica));
System.out.println("Maksimumi: " + Matricat.maksimalja_e_matrices(matrica));
System.out.println("Minimumi: " + Matricat.minimalja_e_matrices(matrica));

🛠 Kërkesat

Java 8 ose më e re
