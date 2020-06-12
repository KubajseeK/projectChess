package sk.itsovy.kutka;

import static org.junit.jupiter.api.Assertions.*;

class ChessTest {
    Chess  chess = new Chess();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void normalize() {
        assertEquals("A1",chess.normalize("1a"));
        assertEquals("A2",chess.normalize("2a"));
        assertEquals("A3",chess.normalize("3a"));
        assertEquals("A4",chess.normalize("4a"));
        assertEquals("A5",chess.normalize("5a"));
        assertEquals("A6",chess.normalize("6a"));
        assertEquals("A7",chess.normalize("7a"));
        assertEquals("A8",chess.normalize("8a"));

        assertEquals("B1",chess.normalize("1b"));
        assertEquals("B2",chess.normalize("2b"));
        assertEquals("B3",chess.normalize("3b"));
        assertEquals("B4",chess.normalize("4b"));
        assertEquals("B5",chess.normalize("5b"));
        assertEquals("B6",chess.normalize("6b"));
        assertEquals("B7",chess.normalize("7b"));
        assertEquals("B8",chess.normalize("8b"));

        assertEquals("C1",chess.normalize("1c"));
        assertEquals("C2",chess.normalize("2c"));
        assertEquals("C3",chess.normalize("3c"));
        assertEquals("C4",chess.normalize("4c"));
        assertEquals("C5",chess.normalize("5c"));
        assertEquals("C6",chess.normalize("6c"));
        assertEquals("C7",chess.normalize("7c"));
        assertEquals("C8",chess.normalize("8c"));

        assertEquals("D1",chess.normalize("1d"));
        assertEquals("D2",chess.normalize("2d"));
        assertEquals("D3",chess.normalize("3d"));
        assertEquals("D4",chess.normalize("4d"));
        assertEquals("D5",chess.normalize("5d"));
        assertEquals("D6",chess.normalize("6d"));
        assertEquals("D7",chess.normalize("7d"));
        assertEquals("D8",chess.normalize("8d"));

        assertEquals("E1",chess.normalize("1e"));
        assertEquals("E2",chess.normalize("2e"));
        assertEquals("E3",chess.normalize("3e"));
        assertEquals("E4",chess.normalize("4e"));
        assertEquals("E5",chess.normalize("5e"));
        assertEquals("E6",chess.normalize("6e"));
        assertEquals("E7",chess.normalize("7e"));
        assertEquals("E8",chess.normalize("8e"));

        assertEquals("F1",chess.normalize("1f"));
        assertEquals("F2",chess.normalize("2f"));
        assertEquals("F3",chess.normalize("3f"));
        assertEquals("F4",chess.normalize("4f"));
        assertEquals("F5",chess.normalize("5f"));
        assertEquals("F6",chess.normalize("6f"));
        assertEquals("F7",chess.normalize("7f"));
        assertEquals("F8",chess.normalize("8f"));

        assertEquals("G1",chess.normalize("1g"));
        assertEquals("G2",chess.normalize("2g"));
        assertEquals("G3",chess.normalize("3g"));
        assertEquals("G4",chess.normalize("4g"));
        assertEquals("G5",chess.normalize("5g"));
        assertEquals("G6",chess.normalize("6g"));
        assertEquals("G7",chess.normalize("7g"));
        assertEquals("G8",chess.normalize("8g"));

        assertEquals("H1",chess.normalize("1h"));
        assertEquals("H2",chess.normalize("2h"));
        assertEquals("H3",chess.normalize("3h"));
        assertEquals("H4",chess.normalize("4h"));
        assertEquals("H5",chess.normalize("5h"));
        assertEquals("H6",chess.normalize("6h"));
        assertEquals("H7",chess.normalize("7h"));
        assertEquals("H8",chess.normalize("8h"));

        assertNull(chess.normalize("R8"));
        assertNull(chess.normalize("9C"));
        assertNull(chess.normalize("10G"));
        assertNull(chess.normalize("10J"));
        assertNull(chess.normalize("46@"));
        assertNull(chess.normalize("2@"));
        assertNull(chess.normalize(null));
        assertNull(chess.normalize(""));
        assertNull(chess.normalize("  "));
        assertNull(chess.normalize("y4"));
    }

    @org.junit.jupiter.api.Test
    void checkKing() {
        assertTrue(chess.checkKing("f5","6f"));
        assertTrue(chess.checkKing("f5","6e"));
        assertTrue(chess.checkKing("f5","5e"));
        assertTrue(chess.checkKing("f5","4e"));
        assertTrue(chess.checkKing("f5","4f"));
        assertTrue(chess.checkKing("f5","4f"));
        assertTrue(chess.checkKing("f5","5g"));

        assertFalse(chess.checkKing("f5","a5"));
        assertFalse(chess.checkKing("f5","c7"));
        assertFalse(chess.checkKing("f5","d9"));
        assertFalse(chess.checkKing("f5","f7"));
        assertFalse(chess.checkKing("f5",""));
        assertFalse(chess.checkKing("f5"," "));
        assertFalse(chess.checkKing("f5",null));
    }

    @org.junit.jupiter.api.Test
    void checkQueen() {
        assertTrue(chess.checkQueen("d4","d8"));
        assertTrue(chess.checkQueen("d4","4h"));
        assertTrue(chess.checkQueen("d4","8h"));
        assertTrue(chess.checkQueen("d4","6b"));
        assertTrue(chess.checkQueen("d4","6f"));
        assertTrue(chess.checkQueen("d4","1g"));

        assertFalse(chess.checkQueen("d4","h5"));
        assertFalse(chess.checkQueen("d4","6a"));
        assertFalse(chess.checkQueen("d4","2e"));
        assertFalse(chess.checkQueen("d4","x5"));
        assertFalse(chess.checkQueen("d4","66"));
        assertFalse(chess.checkQueen("d4",null));

    }

    @org.junit.jupiter.api.Test
    void checkBishop() {
        assertTrue(chess.checkBishop("d5","8a"));
        assertTrue(chess.checkBishop("d5","8g"));
        assertTrue(chess.checkBishop("d5","6c"));
        assertTrue(chess.checkBishop("d5","6e"));
        assertTrue(chess.checkBishop("d5","1h"));

        assertFalse(chess.checkBishop("d5","5g"));
        assertFalse(chess.checkBishop("d5","8h"));
        assertFalse(chess.checkBishop("d5","x6"));
        assertFalse(chess.checkBishop("d5",null));
        assertFalse(chess.checkBishop("d5","9"));

    }

    @org.junit.jupiter.api.Test
    void checkRook() {
        assertTrue(chess.checkRook("d5","e5"));
        assertTrue(chess.checkRook("d5","f5"));
        assertTrue(chess.checkRook("d5","g5"));
        assertTrue(chess.checkRook("d5","h5"));
        assertTrue(chess.checkRook("d5","c5"));


        assertFalse(chess.checkRook("d5","e8"));
        assertFalse(chess.checkRook("d5","f8"));
        assertFalse(chess.checkRook("d5","g8"));
        assertFalse(chess.checkRook("d5","h8"));
        assertFalse(chess.checkRook("d5",null));

    }

    @org.junit.jupiter.api.Test
    void checkKnight() {
        assertTrue(chess.checkKnight("d4","3b"));
        assertTrue(chess.checkKnight("d4","5b"));
        assertTrue(chess.checkKnight("d4","6c"));
        assertTrue(chess.checkKnight("d4","6e"));
        assertTrue(chess.checkKnight("d4","5f"));


        assertFalse(chess.checkKnight("d4","5d"));
        assertFalse(chess.checkKnight("d4","5e"));
        assertFalse(chess.checkKnight("d4","5x"));
        assertFalse(chess.checkKnight("d4","9"));
        assertFalse(chess.checkKnight("d4",null));

    }
}