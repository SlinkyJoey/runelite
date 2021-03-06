import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	field3131(6, 22, false, false, true);

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static IndexedSprite field3134;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1823451795
	)
	final int id;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1522972387
	)
	public final int modIcon;
	@ObfuscatedName("m")
	public final boolean isPrivileged;
	@ObfuscatedName("n")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 24
		this.modIcon = var4; // L: 25
		this.isPrivileged = var6; // L: 26
		this.isUser = var7; // L: 27
	} // L: 28

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 31
	}
}
