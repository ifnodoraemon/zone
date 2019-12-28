<template>
    <v-app-bar>
        <v-app-bar-nav-icon></v-app-bar-nav-icon>
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
                links: 'links'
            })
        },

        methods: {
            ...mapMutations(['toggleDrawer']),
            onClick: function (e, item) {
                e.stopPropagation();

                if (item.to || !item.href) return;

                this.$vuetify.goTo(item.href)
            }
        }
    }
</script>

<style scoped>

</style>
