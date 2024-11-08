package com.xworkz.map.dto;


public enum Code {

	AFGHANISTAN(93), ALBANIA(355), ALGERIA(213), ANDORRA(376), ANGOLA(244), ANTIGUA_AND_BARBUDA(1268), ARGENTINA(54),
	ARMENIA(374), AUSTRALIA(61), AUSTRIA(43), AZERBAIJAN(994), BAHAMAS(1242), BAHRAIN(973), BANGLADESH(880),
	BARBADOS(1246), BELARUS(375), BELGIUM(32), BELIZE(501), BENIN(229), BHUTAN(975), BOLIVIA(591),
	BOSNIA_AND_HERZEGOVINA(387), BOTSWANA(267), BRAZIL(55), BRUNEI(673), BULGARIA(359), BURKINA_FASO(226), BURUNDI(257),
	CABO_VERDE(238), CAMBODIA(855), CAMEROON(237), CANADA(1), CENTRAL_AFRICAN_REPUBLIC(236), CHAD(235), CHILE(56),
	CHINA(86), COLOMBIA(57), COMOROS(269), CONGO_BRAZZAVILLE(242), CONGO_KINSHASA(243), COSTA_RICA(506), CROATIA(385),
	CUBA(53), CYPRUS(357), CZECH_REPUBLIC(420), DENMARK(45), DJIBOUTI(253), DOMINICA(1767), DOMINICAN_REPUBLIC(1809),
	ECUADOR(593), EGYPT(20), EL_SALVADOR(503), EQUATORIAL_GUINEA(240), ERITREA(291), ESTONIA(372), ESWATINI(268),
	ETHIOPIA(251), FIJI(679), FINLAND(358), FRANCE(33), GABON(241), GAMBIA(220), GEORGIA(995), GERMANY(49), GHANA(233),
	GREECE(30), GRENADA(1473), GUATEMALA(502), GUINEA(224), GUINEA_BISSAU(245), GUYANA(592), HAITI(509), HONDURAS(504),
	HUNGARY(36), ICELAND(354), INDIA(91), INDONESIA(62), IRAN(98), IRAQ(964), IRELAND(353), ISRAEL(972), ITALY(39),
	JAMAICA(1876), JAPAN(81), JORDAN(962), KAZAKHSTAN(7), KENYA(254), KIRIBATI(686), KUWAIT(965), KYRGYZSTAN(996),
	LAOS(856), LATVIA(371), LEBANON(961), LESOTHO(266), LIBERIA(231), LIBYA(218), LIECHTENSTEIN(423), LITHUANIA(370),
	LUXEMBOURG(352), MADAGASCAR(261), MALAWI(265), MALAYSIA(60), MALDIVES(960), MALI(223), MALTA(356),
	MARSHALL_ISLANDS(692), MAURITANIA(222), MAURITIUS(230), MEXICO(52), MICRONESIA(691), MOLDOVA(373), MONACO(377),
	MONGOLIA(976), MONTENEGRO(382), MOROCCO(212), MOZAMBIQUE(258), MYANMAR(95), NAMIBIA(264), NAURU(674), NEPAL(977),
	NETHERLANDS(31), NEW_ZEALAND(64), NICARAGUA(505), NIGER(227), NIGERIA(234), NORTH_KOREA(850), NORTH_MACEDONIA(389),
	NORWAY(47), OMAN(968), PAKISTAN(92), PALAU(680), PANAMA(507), PAPUA_NEW_GUINEA(675), PARAGUAY(595), PERU(51),
	PHILIPPINES(63), POLAND(48), PORTUGAL(351), QATAR(974), ROMANIA(40), RUSSIA(7), RWANDA(250),
	SAINT_KITTS_AND_NEVIS(1869), SAINT_LUCIA(1758), SAINT_VINCENT_AND_THE_GRENADINES(1784), SAMOA(685), SAN_MARINO(378),
	SAO_TOME_AND_PRINCIPE(239), SAUDI_ARABIA(966), SENEGAL(221), SERBIA(381), SEYCHELLES(248), SIERRA_LEONE(232),
	SINGAPORE(65), SLOVAKIA(421), SLOVENIA(386), SOLOMON_ISLANDS(677), SOMALIA(252), SOUTH_AFRICA(27), SOUTH_KOREA(82),
	SOUTH_SUDAN(211), SPAIN(34), SRI_LANKA(94), SUDAN(249), SURINAME(597), SWEDEN(46), SWITZERLAND(41), SYRIA(963),
	TAIWAN(886), TAJIKISTAN(992), TANZANIA(255), THAILAND(66), TIMOR_LESTE(670), TOGO(228), TONGA(676),
	TRINIDAD_AND_TOBAGO(1868), TUNISIA(216), TURKEY(90), TURKMENISTAN(993), TUVALU(688), UGANDA(256), UKRAINE(380),
	UNITED_ARAB_EMIRATES(971), UNITED_KINGDOM(44), UNITED_STATES(1), URUGUAY(598), UZBEKISTAN(998), VANUATU(678),
	VATICAN_CITY(39), VENEZUELA(58), VIETNAM(84), YEMEN(967), ZAMBIA(260), ZIMBABWE(263);

	private int countryCode;

	private Code(int code) {
		this.countryCode = code;
	}

	public int getCountryCode() {
		return countryCode;
	}

}
