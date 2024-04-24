package week02;

import java.util.HashMap;
import java.util.Map;

public class Practice02 {
    public static void main(String[] args) {
        Map<String, String> recipeMap = new HashMap<String, String>();
        recipeMap.put("재료", "새우(생 또는 냉동): 500g\n" +
                "                마늘: 4~6쪽(다진 것)\n" +
                "                올리브 오일: 1/2컵\n" +
                "                토마토: 1개(다진 것 또는 통조림)\n" +
                "                허브(로즈마리, 시나몬, 또는 다른 허브 사용 가능): 약간\n" +
                "                파슬리: 다진 것 2큰술\n" +
                "                레몬 주스: 1큰술\n" +
                "                소금: 맛에 따라\n" +
                "                후추: 맛에 따라\n" +
                "                빵: 구운 것(면 또는 바게트)");
        recipeMap.put("조리 절차", "큰 팬에 올리브 오일을 예열합니다.\n" +
                "                마늘을 넣고 중간 불에서 볶습니다. 마늘이 황금색이 될 때까지 약 1분 정도 볶습니다.\n" +
                "                새우를 넣고 익힙니다. 새우가 붉은색으로 변하고 익히면 덜어냅니다.\n" +
                "                동일한 팬에 토마토를 넣고 볶아 소스를 만듭니다. 토마토가 삶아지고 액체가 증발할 때까지 약 5분간 볶습니다.\n" +
                "                소금, 후추, 허브를 넣고 조미료를 맞춥니다.\n" +
                "                새우를 다시 팬에 넣고 새우와 소스가 잘 섞이도록 볶습니다.\n" +
                "                레몬 주스를 더하고 파슬리를 첨가하여 마무리합니다.\n" +
                "                바게트 또는 면 빵과 함께 내어 드세요.");
        System.out.println(recipeMap);
    }
}
