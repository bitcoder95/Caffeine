package me.amar0908.lipi.language;

import me.amar0908.lipi.language.Block;
import me.amar0908.lipi.language.Class;
import me.amar0908.lipi.language.Utils;

public class Line extends Block {

    private final String line;

    public Line(Block superBlock, String line) {
        super(superBlock);

        this.line = line;
    }

    public void run() throws Utils.InvalidCodeException {
        ((Class) getBlockTree()[0]).methodParser.parse(getSuperBlock(), line);
    }

    @Override
    public String toString() {
        return "Line text=" + line;
    }
}
