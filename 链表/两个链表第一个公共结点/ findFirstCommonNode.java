public ListNode findFirstCommonNode (ListNode pHead1, ListNode pHead2) {
    if (pHead1 == null || pHead2 == null) {
        return null;
    }

    //定义两个指针
    ListNode node1 = pHead1, node2 = pHead2;
    int length1 = 0, length2 = 0;
    //遍历两个链表
    while (node1 != null) {
        length1 += 1;
        node1 = node1.next;
    }
    while (node2 != null) {
        length2 += 1;
        node2 = node2.next;
    }
    //对较长链表的头结点处理，先走差值k步
    if (length1 > length2) {
        int k = length1 - length2;
        while (k != 0) {
            pHead1 = pHead1.next;
            k--;
        }       
    } else {
        int k = length2 - length1;
        while (k != 0) {
            pHead2 = pHead2.next;
            k--;
        }       
    }
    //遍历第一个相同的节点就是第一个公共节点
    while (pHead1 != pHead2) {
        pHead1 = pHead1.next;
        pHead2 = pHead2.next;
    }
    return pHead1;
}