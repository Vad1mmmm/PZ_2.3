package pz_2_3_2_my_array_list;

import java.util.Objects;

public class Box {
    private final int width;
    private final int length;
    private final int height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public int getVolume(){
        return this.width*this.length*this.height;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(width, length, height);
    }
    @Override
    public String toString() {
        return String.format("box of width %d, length %d, height %d has volume %d",
                this.width, this.length, this.height, this.getVolume());
    }
}