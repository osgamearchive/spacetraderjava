package spacetrader.enums;

public enum StarSystemId implements SpaceTraderEnum// : int
{
	NA, // = -1,
	Acamar, // = 0,
	Adahn, // = 1,
	Aldea, // = 2,
	Andevian, // = 3,
	Antedi, // = 4,
	Balosnee, // = 5,
	Baratas, // = 6,
	Brax, // = 7,
	Bretel, // = 8,
	Calondia, // = 9,
	Campor, // = 10,
	Capelle, // = 11,
	Carzon, // = 12,
	Castor, // = 13,
	Cestus, // = 14,
	Cheron, // = 15,
	Courteney, // = 16,
	Daled, // = 17,
	Damast, // = 18,
	Davlos, // = 19,
	Deneb, // = 20,
	Deneva, // = 21,
	Devidia, // = 22,
	Draylon, // = 23,
	Drema, // = 24,
	Endor, // = 25,
	Esmee, // = 26,
	Exo, // = 27,
	Ferris, // = 28,
	Festen, // = 29,
	Fourmi, // = 30,
	Frolix, // = 31,
	Gemulon, // = 32,
	Guinifer, // = 33,
	Hades, // = 34,
	Hamlet, // = 35,
	Helena, // = 36,
	Hulst, // = 37,
	Iodine, // = 38,
	Iralius, // = 39,
	Janus, // = 40,
	Japori, // = 41,
	Jarada, // = 42,
	Jason, // = 43,
	Kaylon, // = 44,
	Khefka, // = 45,
	Kira, // = 46,
	Klaatu, // = 47,
	Klaestron, // = 48,
	Korma, // = 49,
	Kravat, // = 50,
	Krios, // = 51,
	Laertes, // ,//= 52,
	Largo, // V ,//= 53,
	Lave, // ,//= 54,
	Ligon, // ,//= 55,
	Lowry, // ,//= 56,
	Magrat, // ,//= 57,
	Malcoria, // ,//= 58,
	Melina, // ,//= 59,
	Mentar, // ,//= 60,
	Merik, // ,//= 61,
	Mintaka, // ,//= 62,
	Montor, // ,//= 63,
	Mordan, // ,//= 64,
	Myrthe, // ,//= 65,
	Nelvana, // ,//= 66,
	Nix, // ,//= 67,
	Nyle, // ,//= 68,
	Odet, // ,//= 69,
	Og, // ,//= 70,
	Omega, // ,//= 71,
	Omphalos, // ,//= 72,
	Orias, // ,//= 73,
	Othello, // ,//= 74,
	Parade, // ,//= 75,
	Penthara, // ,//= 76,
	Picard, // ,//= 77,
	Pollux, // ,//= 78,
	Quator, // ,//= 79,
	Rakhar, // V ,//= 80,
	Ran, // ,//= 81,
	Regulas, // ,//= 82,
	Relva, // ,//= 83,
	Rhymus, // ,//= 84,
	Rochani, // ,//= 85,
	Rubicum, // ,//= 86,
	Rutia, // ,//= 87,
	Sarpeidon, // ,/,/// ,//= 88,
	Sefalla, // ,//= 89,
	Seltrice, // ,//= 90,
	Sigma, // ,//= 91,
	Sol, // ,//= 92,
	Somari, // ,//= 93,
	Stakoron, // ,//= 94,
	Styris, // ,//= 95,
	Talani, // ,//= 96,
	Tamus, // ,//= 97,
	Tantalos, // ,//= 98,
	Tanuga, // ,//= 99,
	Tarchannen, // ,//= 100,
	Terosa, // ,//= 101,
	Thera, // ,//= 102,
	Titan, // ,//= 103,
	Torin, // ,//= 104,
	Triacus, // ,//= 105,
	Turkana, // ,//= 106,
	Tyrus, // ,//= 107,
	Umberlee, // ,//= 108,
	Utopia, // ,//= 109,
	Vadera, // ,//= 110,
	Vagra, // ,//= 111,
	Vandor, // ,//= 112,
	Ventax, // ,//= 113,
	Xenon, // ,//= 114,
	Xerxes, // ,//= 115,
	Yew, // ,//= 116,
	Yojimbo, // ,//= 117,
	Zalkon, // ,//= 118,
	Zuul, // ,//= 119,
	Centauri, // ,//= 120,
	Galvon, // ,//= 121,
	Inthara, // ,//= 122,
	Meridian, // ,//= 123,
	Qonos, // ,//= 124,
	Rae, // ,//= 125,
	Weytahn, // ,//= 126,
	Zonama;// ,//= 127
	public int CastToInt()
	{
		return ordinal() - 1;
	}

	public static StarSystemId FromInt(int i)
	{
		return values()[i+1];
	}
}