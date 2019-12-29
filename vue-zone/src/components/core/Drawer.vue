<template>
    <v-carousel
            :show-arrows="true"
            :cycle="true"
    >
        <v-carousel-item
                v-for="(item, i) in carousels"
                :key="i"
        >
            <v-sheet
                    :color="item.color"
                    height="100%"
                    tile
            >
                <v-row
                        class="fill-height"
                        align="center"
                        justify="center"
                >
                    <div class="display-3">Slide {{ i + 1 }}</div>
                </v-row>
            </v-sheet>

        </v-carousel-item>
    </v-carousel>
</template>

<script>
    import {
        mapGetters
    } from 'vuex';

    export default {
        name: "Drawer",
        computed: {
            ...mapGetters({
                carousels: 'carousels'
            })
        }
    }
</script>

<style scoped>

</style>
