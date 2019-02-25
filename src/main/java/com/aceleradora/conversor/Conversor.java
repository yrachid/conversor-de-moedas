package com.aceleradora.conversor;

public class Conversor {

        public String converter(String entrada) {

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

        private boolean moedaDisponivel(String codigoMoeda) {

            EnumMoeda[] moedasDisponiveis = EnumMoeda.values();

            for (int i = 0; i < moedasDisponiveis.length; i++) {
                if (moedasDisponiveis[i].getCodigo().equals(codigoMoeda)) {
                    return true;
                }
            }

            return false;
        }
    }

