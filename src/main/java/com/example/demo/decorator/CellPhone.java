package com.example.demo.decorator;

import java.util.Set;

public interface CellPhone {
    Set<Functionality> getFunctionalities();
    double getPrice();

    enum Functionality {
        CALL {
            @Override
            public double price() {
                return 1.0;
            }
        }, PHOTO {
            @Override
            public double price() {
                return 2.0;
            }
        }, VIDEO {
            @Override
            public double price() {
                return 2.0;
            }
        }, GPS {
            @Override
            public double price() {
                return 3.0;
            }
        }, SMS {
            @Override
            public double price() {
                return 0.5;
            }
        }, INTERNET {
            @Override
            public double price() {
                return 3.0;
            }
        }, MUSIC {
            @Override
            public double price() {
                return 0.9;
            }
        };

        public abstract double price();
    }
}
