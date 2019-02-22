package com.aceleradora.conversor;

public class Conversor {

        public String converter(String entrada) {

            String codigoMoedaOriginal = entrada.substring(0, 3);

            int indiceEspaco = entrada.indexOf(" ");
            String codigoMoedaDestino = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

            if (!moedaDisponivel(codigoMoedaOriginal)) {
                return "Moeda indisponivel: " + codigoMoedaOriginal;
            }

            if (!moedaDisponivel(codigoMoedaDestino)) {
                return "Moeda indisponivel: " + codigoMoedaDestino;
            }

            return entrada;
        }

        private boolean moedaDisponivel(String codigoMoeda) {

            Moeda[] moedasDisponiveis = Moeda.values();

            for (int i = 0; i < moedasDisponiveis.length; i++) {
                if (moedasDisponiveis[i].getCodigo().equals(codigoMoeda)) {
                    return true;
                }
            }

            return false;
        }
    }

