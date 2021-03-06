package com.nowcoder.community2.utils;

/**
 * 常量
 */
public class Const {

    /**
     * 系统 id
     */
    public final static int SYSTEM_USER_ID = 0;


    /**
     * 消息队列 topic
     */
    public final static String TOPIC_LIKE = "like";
    public final static String TOPIC_COMMENT = "comment";
    public final static String TOPIC_FOLLOW = "follow";
    public final static String TOPIC_POST = "post";


    /**
     * Post status
     */
    public final static int POST_NORMAL = 0;
    public final static int POST_WONDERFUL = 1;
    public final static int POST_DELETED = 2;

    /**
     * Post type
     */
    public final static int TYPE_NORMAL = 0;
    public final static int TYPE_TOP = 1;

    /**
     * Post Ops
     */
    public static final String TOPIC_POST_TOP = "post_top";
    public static final String TOPIC_POST_WONDER = "post_wonder";
    public static final String TOPIC_POST_DELETE = "post_delete";


    /**
     * Message Status
     */
    public final static int MESSAGE_UNLIMITED = -1;
    public final static int MESSAGE_UNCHECKED = 0;
    public final static int MESSAGE_CHECKED = 1;
    public final static int MESSAGE_DELETED = 2;

    /**
     * 赞的类型
     */
    public final static int LIKE_POST = 1;
    public final static int LIKE_COMMENT = 2;

    /**
     * like status
     */
    public final static int UNLIKE_STATUS = 0;
    public final static int LIKE_STATUS = 1;

    /**
     * 评论的类型
     */
    public final static int COM_POST = 1;
    public final static int COM_COMMENT = 2;


    /**
     * follow status
     */
    public final static int UNFOLLOW_STATUS = 0;
    public final static int FOLLOW_STATUS = 1;


    /**
     * 权限设置
     */
    public final static String AUTHORITY_USER = "user";
    public final static String AUTHORITY_ADMIN = "admin";
    public final static String AUTHORITY_MODERATOR = "moderator";

    public final static int USER = 0;
    public final static int ADMIN = 1;
    public final static int MODERATOR = 2;




}
