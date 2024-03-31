package Strategy.AulaSenac.strategy;

import Strategy.AulaSenac.model.Charge;

public enum ListaEmpresas implements CalcularFrete {

    ABC {
        @Override
        public double calcularPreco(Charge charge) {
            if (charge.getPeso() <= 10) {
                return 12.56;
            } else if (charge.getPeso() <= 20) {
                return 14.78;
            } else {
                return 17.64;
            }
        }
    },
    CBA {
        @Override
        public double calcularPreco(Charge charge) {
            if (charge.getPeso() <= 10) {
                return 10.12;
            } else if (charge.getPeso() <= 20) {
                return 12.34;
            } else {
                return 15.09;
            }
        }
    },
    XPTO {
        @Override
        public double calcularPreco(Charge charge) {
            if (charge.getPeso() <= 10) {
                return 14.77;
            } else if (charge.getPeso() <= 20) {
                return 16.82;
            } else {
                return 18.13;
            }
        }
    };


}
