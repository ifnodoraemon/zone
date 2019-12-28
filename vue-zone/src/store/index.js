import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        user: {},
        links: [
            {
                text: '首页',
                to: '/',
                icon: ''
            },
            {
                text: '关于',
                to: '/about',
                icon: ''
            }
        ]
    },
    //用来对state中的状态进行filter时，抽象公共的方法
    getters: {
        links: state => state.links
    },
    //用来更新state中的状态，只能是同步的
    mutations: {
        setUser(state, user) {
            state.user = user
        },
        logout(state) {
            state.user = {}
        }
    },
    //为了解决mutations不能异步的问题，用actions触发mutations
    actions: {},

    modules: {}
})
