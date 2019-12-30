import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        isLogin: false,
        user: {},
        links: [
            {
                text: '首页',
                to: '/',
            },{
                text: '论坛',
                to: '/discuss',
            },{
                text: '商店',
                to: '/shop'
            },
            {
                text: '关于',
                to: '/about',
            }
        ],
        carousels: [
            {
                color: 'primary'
            },
            {
                color: "secondary"
            }
        ]
    },
    //用来对state中的状态进行filter时，抽象公共的方法
    getters: {
        links: state => state.links,
        isLogin: state => state.isLogin,
        carousels: state => state.carousels
    },
    //用来更新state中的状态，只能是同步的
    mutations: {
        login(state) {
            state.isLogin = true
        },

        logout(state){
            state.isLogin  = false
        }
    },
    //为了解决mutations不能异步的问题，用actions触发mutations
    actions: {},

    modules: {}
})
