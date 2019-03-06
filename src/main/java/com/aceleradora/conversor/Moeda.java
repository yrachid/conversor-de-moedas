package com.aceleradora.conversor;

public enum Moeda {

    DOLAR_AMERICANO("USD"),
    REAL_BRASILEIRO("BRL"),
    PESO_CHILENO("CLP"),
    EURO("EUR");

    private String codigo;

    Moeda(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }



        public static Moeda valorPorCodigo(String codigoMoeda) throws Exception {
            for (Moeda moeda : values()) {
                if (moeda.getCodigo().equals(codigoMoeda)){
                    return moeda;
                }
            }
            throw new Exception("Moeda não suportada" +  codigoMoeda);
        }
    public static String validador(String entrada) {

        String codigoMoedaOriginal = entrada.substring(0, 3);

        int indiceEspaco = entrada.indexOf(" ");
        String codigoMoedaDestino = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

        if (!moedaDisponivel(codigoMoedaOriginal)) {
            return "EnumMoeda indisponivel: " + codigoMoedaOriginal;
        }

        if (!moedaDisponivel(codigoMoedaDestino)) {
            return "EnumMoeda indisponivel: " + codigoMoedaDestino;
        }

        return entrada;
    }

    private static boolean moedaDisponivel(String codigoMoeda) {

        Moeda[] moedasDisponiveis = Moeda.values();

        for (int i = 0; i < moedasDisponiveis.length; i++) {
            if (moedasDisponiveis[i].getCodigo().equals(codigoMoeda)) {
                return true;
            }
        }

        return false;
    }
        }


