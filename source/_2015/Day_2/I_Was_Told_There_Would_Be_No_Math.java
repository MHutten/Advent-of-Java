package advent_of_code._2015.Day_2;

public class I_Was_Told_There_Would_Be_No_Math {

    public static int calculate_area_of_wrapping_paper(int length, int width, int height) {
        int  length_x_width = length * width;
        int  width_x_height = width * height;
        int  height_x_length = height * length;

        return 2 * (length_x_width + width_x_height + height_x_length) + Math.min(Math.min(length_x_width, width_x_height), height_x_length);
    }

    public static int calculate_ribbon_length(int length, int width, int height) {
        return (length + width + height - Math.max(Math.max(length, width), height)) * 2 + length * width * height;
    }

}