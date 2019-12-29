<template>
    <v-app-bar
            dark
    >
        <v-toolbar-title
                class="ma-5"
        >
            如果大雄没有机器猫
        </v-toolbar-title>
        <v-btn
                v-for="(link, i) in links"
                :key="i"
                :to="link.to"
                text
        >
            <!--            <v-icon :if="link.icon"></v-icon>-->
            {{link.text}}
        </v-btn>
        <v-spacer></v-spacer>
        <v-text-field
                append-icon="mdi-magnify"
                flat
                hide-details
                solo-inverted
                style="max-width: 300px"
        >
        </v-text-field>
        <v-spacer></v-spacer>
        <div v-if="!isLogin">
            <v-btn
                    text
                    to="/login"
            >
                登录
            </v-btn>
            <v-btn
                    text
                    to="/register"
            >
                注册
            </v-btn>
        </div>
        <div v-else>
            <v-avatar>
                <v-icon dark>mdi-account-circle</v-icon>
            </v-avatar>
        </div>

    </v-app-bar>
</template>

<script>
    import {
        mapGetters,
        mapMutations
    } from 'vuex'

    export default {
        name: "Toolbar",

        computed: {
            ...mapGetters({
                links: 'links',
                isLogin: 'isLogin'
            })
        },

        methods: {
            ...mapMutations(['toggleDrawer']),
            onClick: function (e, item) {
                e.stopPropagation();

                if (item.to || !item.href) return;

                this.$router.go(0)
            }
        }
    }
</script>

<style scoped>

</style>
