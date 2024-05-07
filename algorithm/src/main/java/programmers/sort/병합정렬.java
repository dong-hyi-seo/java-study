package programmers.sort;

/**
 * 일단 나눴다가 작은 것 부터 합친다.
 *
 * 3, 1, 2, 4, 5
 *
 * - 위 숫자들을 적당히 절반으로 나누다.
 * 3, 1 / 2, 4, 5
 * 하나씩 나올때까지 나눈다
 * 3 / 1 / 2 / 4 / 5
 *
 * 하나씩 다 쪼개놓고 합친다.
 * 끝에 4 / 5는 같은곳에서 쪼개져나온것 대소관계를 비교해서 작은것 순서대로 먼저 넣는다
 *
 * [1], [3], [2], [4,5](이미 정렬됨)
 *
 * [1, 3], [2, 4, 5]
 *
 * 1 vs 2 비교
 * 3 vs 2 비교
 * 3 vs 4 비교 하면서
 * 1, 2, 3, 4, 5 를 만든다
 *
 * 시간복잡도는 O(nlogn)
 *
 */
public class 병합정렬 {
}
