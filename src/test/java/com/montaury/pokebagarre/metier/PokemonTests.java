package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTests {

    @Test
    void estVainqueurContre_plus_grande_attaque_gagne_premier_renseigne() {
        // GIVEN
        boolean agagne;
        int attaqueP1 = 150;
        int attaqueP2 = 100;
        int defenseP1 = 10;
        int defenseP2 = 10;
        Stats statsP1 = new Stats(attaqueP1,defenseP1);
        Pokemon P1 = new Pokemon("pokemon1","",statsP1);
        Stats statsP2 = new Stats(attaqueP2,defenseP2);
        Pokemon P2 = new Pokemon("pokemon2","",statsP2);

        // WHEN
        agagne=P1.estVainqueurContre(P2);

        // THEN
        assertEquals(true,agagne);
    }
    @Test
    void estVainqueurContre_meme_attaque_plus_grande_defense_premier_renseigne() {
        // GIVEN
        boolean agagne;
        int attaqueP1 = 100;
        int attaqueP2 = 100;
        int defenseP1 = 20;
        int defenseP2 = 10;
        Stats statsP1 = new Stats(attaqueP1,defenseP1);
        Pokemon P1 = new Pokemon("pokemon1","",statsP1);
        Stats statsP2 = new Stats(attaqueP2,defenseP2);
        Pokemon P2 = new Pokemon("pokemon2","",statsP2);

        // WHEN
        agagne=P1.estVainqueurContre(P2);

        // THEN
        assertEquals(true,agagne);
    }
    @Test
    void estVainqueurContre_premier_renseigner_gagne_en_cas_egalite() {
        // GIVEN
        boolean agagne;
        int attaqueP1 = 100;
        int attaqueP2 = 100;
        int defenseP1 = 10;
        int defenseP2 = 10;
        Stats statsP1 = new Stats(attaqueP1,defenseP1);
        Pokemon P1 = new Pokemon("pokemon1","",statsP1);
        Stats statsP2 = new Stats(attaqueP2,defenseP2);
        Pokemon P2 = new Pokemon("pokemon2","",statsP2);

        // WHEN
        agagne=P1.estVainqueurContre(P2);

        // THEN
        assertEquals(true,agagne);
    }
    @Test
    void estVainqueurContre_plus_grande_attaque_gagne_second_renseigne() {
        // GIVEN
        boolean agagne;
        int attaqueP1 = 100;
        int attaqueP2 = 150;
        int defenseP1 = 10;
        int defenseP2 = 10;
        Stats statsP1 = new Stats(attaqueP1,defenseP1);
        Pokemon P1 = new Pokemon("pokemon1","",statsP1);
        Stats statsP2 = new Stats(attaqueP2,defenseP2);
        Pokemon P2 = new Pokemon("pokemon2","",statsP2);

        // WHEN
        agagne=P1.estVainqueurContre(P2);

        // THEN
        assertEquals(false,agagne);
    }
    @Test
    void estVainqueurContre_meme_attaque_plus_grande_defense_second_renseigne() {
        // GIVEN
        boolean agagne;
        int attaqueP1 = 100;
        int attaqueP2 = 100;
        int defenseP1 = 10;
        int defenseP2 = 20;
        Stats statsP1 = new Stats(attaqueP1,defenseP1);
        Pokemon P1 = new Pokemon("pokemon1","",statsP1);
        Stats statsP2 = new Stats(attaqueP2,defenseP2);
        Pokemon P2 = new Pokemon("pokemon2","",statsP2);

        // WHEN
        agagne=P1.estVainqueurContre(P2);

        // THEN
        assertEquals(false,agagne);
    }
}