import java.util.Scanner;

import clases.examen;

public class punto8 {

    static boolean ingresarUsuario(boolean aprovado, boolean presentado, String usuario){
        boolean con = false;
        if (usuario.equals(examen1.getUsuario()) | usuario.equals(examen2.getUsuario()) | usuario.equals(examen3.getUsuario()) | usuario.equals(examen4.getUsuario()) | usuario.equals(examen5.getUsuario()) | usuario.equals(examen6.getUsuario()) | usuario.equals(examen7.getUsuario()) | usuario.equals(examen8.getUsuario())) {
            System.out.println("Este usuario ya existe\n");
            con = false;
            return con;
        } else {
            if (examen1.getUsuario().equals("")) {
                examen1.setAprovado(aprovado);
                examen1.setPresentado(presentado);
                examen1.setUsuario(usuario);
                System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                con = true;
                return con;
            } else {
                if (examen2.getUsuario().equals("")) {
                    examen2.setAprovado(aprovado);
                    examen2.setPresentado(presentado);
                    examen2.setUsuario(usuario);
                    System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                    con = true;
                    return con;
                } else {
                    if (examen3.getUsuario().equals("")) {
                        examen3.setAprovado(aprovado);
                        examen3.setPresentado(presentado);
                        examen3.setUsuario(usuario);
                        System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                        con = true;
                        return con;
                    } else {
                        if (examen4.getUsuario().equals("")) {
                            examen4.setAprovado(aprovado);
                            examen4.setPresentado(presentado);
                            examen4.setUsuario(usuario);
                            System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                            con = true;
                            return con;
                        } else {
                            if (examen5.getUsuario().equals("")) {
                                examen5.setAprovado(aprovado);
                                examen5.setPresentado(presentado);
                                examen5.setUsuario(usuario);
                                System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                                con = true;
                                return con;
                            } else {
                                if (examen6.getUsuario().equals("")) {
                                    examen6.setAprovado(aprovado);
                                    examen6.setPresentado(presentado);
                                    examen6.setUsuario(usuario);
                                    System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                                    con = true;
                                    return con;
                                } else {
                                    if (examen7.getUsuario().equals("")) {
                                        examen7.setAprovado(aprovado);
                                        examen7.setPresentado(presentado);
                                        examen7.setUsuario(usuario);
                                        System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                                        con = true;
                                        return con;
                                    } else {
                                        if (examen8.getUsuario().equals("")) {
                                            examen8.setAprovado(aprovado);
                                            examen8.setPresentado(presentado);
                                            examen8.setUsuario(usuario);
                                            System.out.println("Se ha añadido el usuario correctamente: \n" + "Usuario: " + usuario + "\n");
                                            con = true;
                                            return con;
                                        } else {
                                            System.out.println("No se pueden ingresar mas vehiculos");
                                            con = false;
                                            return con;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void consultarPresentados(){
        String [] vectorSi = new String [8];
        String [] vectorNo = new String [8];
        int i=0;
        int j=0;
        boolean control = false;
        for (int k = 0; k <=8; k++) {
            if (examen1.getUsuario().equals("") & examen2.getUsuario().equals("") & examen3.getUsuario().equals("") & examen4.getUsuario().equals("") & examen5.getUsuario().equals("") & examen6.getUsuario().equals("") & examen7.getUsuario().equals("") & examen8.getUsuario().equals("")) {
                System.out.println("No hay ningun usuario en el sistema\n");
                control = false;
                return;
            } else {
                if (examen1.isPresentado() == true & examen1.getUsuario() != "" & k == 0) {
                    vectorSi[i] = examen1.getUsuario();
                    i++;
                } else {
                    if (examen2.isPresentado() == true & examen2.getUsuario() != "" & k == 1) {
                        vectorSi[i] = examen2.getUsuario();
                        i++;
                    } else {
                        if (examen3.isPresentado() == true & examen3.getUsuario() != "" & k == 2) {
                            vectorSi[i] = examen3.getUsuario();
                            i++;
                        } else {
                            if (examen4.isPresentado() == true & examen4.getUsuario() != "" & k == 3) {
                                vectorSi[i] = examen4.getUsuario();
                                i++;
                            } else {
                                if (examen5.isPresentado() == true & examen5.getUsuario() != "" & k == 4) {
                                    vectorSi[i] = examen5.getUsuario();
                                    i++;
                                } else {
                                    if (examen6.isPresentado() == true & examen6.getUsuario() != "" & k == 5) {
                                        vectorSi[i] = examen6.getUsuario();
                                        i++;
                                    } else {
                                        if (examen7.isPresentado() == true & examen7.getUsuario() != "" & k == 6) {
                                            vectorSi[i] = examen7.getUsuario();
                                            i++;
                                        } else {
                                            if (examen8.isPresentado() == true & examen8.getUsuario() != "" & k == 7) {
                                                vectorSi[i] = examen8.getUsuario();
                                                i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int k = 0; k <=8; k++) {
            if (examen1.getUsuario().equals("") & examen2.getUsuario().equals("") & examen3.getUsuario().equals("") & examen4.getUsuario().equals("") & examen5.getUsuario().equals("") & examen6.getUsuario().equals("") & examen7.getUsuario().equals("") & examen8.getUsuario().equals("")) {
                control = false;
                return;
            } else {
                if (examen1.isPresentado() == false & examen1.getUsuario() != "" & k == 0) {
                    vectorNo[i] = examen1.getUsuario();
                    i++;
                } else {
                    if (examen2.isPresentado() == false & examen2.getUsuario() != "" & k == 1) {
                        vectorNo[i] = examen2.getUsuario();
                        i++;
                    } else {
                        if (examen3.isPresentado() == false & examen3.getUsuario() != "" & k == 2) {
                            vectorNo[i] = examen3.getUsuario();
                            i++;
                        } else {
                            if (examen4.isPresentado() == false & examen4.getUsuario() != "" & k == 3) {
                                vectorNo[i] = examen4.getUsuario();
                                i++;
                            } else {
                                if (examen5.isPresentado() == false & examen5.getUsuario() != "" & k == 4) {
                                    vectorNo[i] = examen5.getUsuario();
                                    i++;
                                } else {
                                    if (examen6.isPresentado() == false & examen6.getUsuario() != "" & k == 5) {
                                        vectorNo[i] = examen6.getUsuario();
                                        i++;
                                    } else {
                                        if (examen7.isPresentado() == false & examen7.getUsuario() != "" & k == 6) {
                                            vectorNo[i] = examen7.getUsuario();
                                            i++;
                                        } else {
                                            if (examen8.isPresentado() == false & examen8.getUsuario() != "" & k == 7) {
                                                vectorNo[i] = examen8.getUsuario();
                                                i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        control = true;
        if (control == true) {
            System.out.println("Esta es una lista de los usuarios que aprovaron el curso: \n");
            for (i=0; i<vectorSi.length; i++) {
                if (vectorSi[i] != null) {
                    System.out.println(vectorSi[i]);
                }
            }
            System.out.println("Y esta de los usuarios que no aprovaron el curso: \n");
            for (j=0; j<vectorNo.length; j++) {
                if (vectorNo[j] != null) {
                    System.out.println(vectorNo[j]);
                }
            }
        }
        return;
    }

    static void consultarResultados(){
        String [] vectorSi = new String [8];
        String [] vectorNo = new String [8];
        int i=0;
        int j=0;
        for (int k = 0; k <=8; k++) {
            if (examen1.getUsuario().equals("") & examen2.getUsuario().equals("") & examen3.getUsuario().equals("") & examen4.getUsuario().equals("") & examen5.getUsuario().equals("") & examen6.getUsuario().equals("") & examen7.getUsuario().equals("") & examen8.getUsuario().equals("")) {
                System.out.println("No hay ningun usuario en el sistema\n");
                return;
            } else {
                if (examen1.isAprovado() == true  & examen1.getUsuario() != "" & k == 0) {
                    vectorSi[i] = examen1.getUsuario();
                    i++;
                } else {
                    if (examen2.isAprovado() == true & examen1.getUsuario() != "" & k == 1) {
                        vectorSi[i] = examen2.getUsuario();
                        i++;
                    } else {
                        if (examen3.isAprovado() == true & examen1.getUsuario() != "" & k == 2) {
                            vectorSi[i] = examen3.getUsuario();
                            i++;
                        } else {
                            if (examen4.isAprovado() == true & examen1.getUsuario() != "" & k == 3) {
                                vectorSi[i] = examen4.getUsuario();
                                i++;
                            } else {
                                if (examen5.isAprovado() == true & examen1.getUsuario() != "" & k == 4) {
                                    vectorSi[i] = examen5.getUsuario();
                                    i++;
                                } else {
                                    if (examen6.isAprovado() == true & examen1.getUsuario() != "" & k == 5) {
                                        vectorSi[i] = examen6.getUsuario();
                                        i++;
                                    } else {
                                        if (examen7.isAprovado() == true & examen1.getUsuario() != "" & k == 6) {
                                            vectorSi[i] = examen7.getUsuario();
                                            i++;
                                        } else {
                                            if (examen8.isAprovado() == true & examen1.getUsuario() != "" & k == 7) {
                                                vectorSi[i] = examen8.getUsuario();
                                                i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int k = 0; k <=8; k++) {
            if (examen1.getUsuario().equals("") & examen2.getUsuario().equals("") & examen3.getUsuario().equals("") & examen4.getUsuario().equals("") & examen5.getUsuario().equals("") & examen6.getUsuario().equals("") & examen7.getUsuario().equals("") & examen8.getUsuario().equals("")) {
                return;
            } else {
                if (examen1.isAprovado() == false  & examen1.getUsuario() != "" & k == 0) {
                    vectorNo[i] = examen1.getUsuario();
                    i++;
                } else {
                    if (examen2.isAprovado() == false & examen1.getUsuario() != "" & k == 1) {
                        vectorNo[i] = examen2.getUsuario();
                        i++;
                    } else {
                        if (examen3.isAprovado() == false & examen1.getUsuario() != "" & k == 2) {
                            vectorNo[i] = examen3.getUsuario();
                            i++;
                        } else {
                            if (examen4.isAprovado() == false & examen1.getUsuario() != "" & k == 3) {
                                vectorNo[i] = examen4.getUsuario();
                                i++;
                            } else {
                                if (examen5.isAprovado() == false & examen1.getUsuario() != "" & k == 4) {
                                    vectorNo[i] = examen5.getUsuario();
                                    i++;
                                } else {
                                    if (examen6.isAprovado() == false & examen1.getUsuario() != "" & k == 5) {
                                        vectorNo[i] = examen6.getUsuario();
                                        i++;
                                    } else {
                                        if (examen7.isAprovado() == false & examen1.getUsuario() != "" & k == 6) {
                                            vectorNo[i] = examen7.getUsuario();
                                            i++;
                                        } else {
                                            if (examen8.isAprovado() == false & examen1.getUsuario() != "" & k == 7) {
                                                vectorNo[i] = examen8.getUsuario();
                                                i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        control = true;
        if (control == true) {
            System.out.println("Esta es una lista de los usuarios que presentaron el curso: \n");
            for (i=0; i<vectorSi.length; i++) {
                if (vectorSi[i] != null) {
                    System.out.println(vectorSi[i]);
                }
            }
            System.out.println("Y esta de los usuarios que no presentaron el curso: \n");
            for (j=0; j<vectorNo.length; j++) {
                if (vectorNo[j] != null) {
                    System.out.println(vectorNo[j]);
                }
            }
        }
        return;
    }

    private static String usuario;
    private static boolean aprovado, presentado, control=true, confirma;
    private static int opcion, i=0, sino;
    static Scanner input = new Scanner(System.in);

    static examen examen1 = new examen(false, false, "");
    static examen examen2 = new examen(false, false, "");
    static examen examen3 = new examen(false, false, "");
    static examen examen4 = new examen(false, false, "");
    static examen examen5 = new examen(false, false, "");
    static examen examen6 = new examen(false, false, "");
    static examen examen7 = new examen(false, false, "");
    static examen examen8 = new examen(false, false, "");

    public static void main(String[] args) {
        
        while (control == true) {
            System.out.println("Bienvenido a la escuela automovilistica El Maestro\n" + "1. Ingresar usuario\n" +
            "2. Consultar presentados\n" + "3. Consultar resultados\n" + "0. Salir\n");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    if (i >= 8) {
                        System.out.println("Ya no se admiten mas usuarios\n");
                    } else {
                        System.out.println("Por favor ingrese los siguientes datos: \n" +
                        "Nombre de usuario: \n");
                        usuario = input.next();
                        System.out.println("¿El usuario aprovo el curso?\n" + "1. Si\n" + "2. No\n");
                        sino = input.nextInt();
                        if (sino == 1) {
                            aprovado = true;
                            sino = 0;
                        } else {
                            aprovado = false;
                            sino = 0;
                        }
                        System.out.println("¿El usuario presento el curso?\n" + "1. Si\n" + "2. No\n");
                        sino = input.nextInt();
                        if (sino == 1) {
                            presentado = true;
                            sino = 0;
                        } else {
                            presentado = false;
                            sino = 0;
                        }
                        confirma = ingresarUsuario(aprovado, presentado, usuario);
                        if (confirma == true) {
                            i = i + 1;
                            confirma = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Consultando usuarios que presentaron el curso: \n");
                    consultarPresentados();
                    break;
                case 3:
                    System.out.println("Consultando usuarios que aprovaron el curso: \n");
                    consultarResultados();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    control = false;
                    break;
            
                default:
                    System.out.println("La opcion elegida no existe");
                    break;
            }
        }
    }
}
