/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class settings_pack {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected settings_pack(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(settings_pack obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_settings_pack(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_str(int name, String val) {
    libtorrent_jni.settings_pack_set_str(swigCPtr, this, name, val);
  }

  public void set_int(int name, int val) {
    libtorrent_jni.settings_pack_set_int(swigCPtr, this, name, val);
  }

  public void set_bool(int name, boolean val) {
    libtorrent_jni.settings_pack_set_bool(swigCPtr, this, name, val);
  }

  public boolean has_val(int name) {
    return libtorrent_jni.settings_pack_has_val(swigCPtr, this, name);
  }

  public void clear() {
    libtorrent_jni.settings_pack_clear(swigCPtr, this);
  }

  public String get_str(int name) {
    return libtorrent_jni.settings_pack_get_str(swigCPtr, this, name);
  }

  public int get_int(int name) {
    return libtorrent_jni.settings_pack_get_int(swigCPtr, this, name);
  }

  public boolean get_bool(int name) {
    return libtorrent_jni.settings_pack_get_bool(swigCPtr, this, name);
  }

  public settings_pack() {
    this(libtorrent_jni.new_settings_pack(), true);
  }

  public enum type_bases {
    string_type_base(libtorrent_jni.settings_pack_string_type_base_get()),
    int_type_base(libtorrent_jni.settings_pack_int_type_base_get()),
    bool_type_base(libtorrent_jni.settings_pack_bool_type_base_get()),
    type_mask(libtorrent_jni.settings_pack_type_mask_get()),
    index_mask(libtorrent_jni.settings_pack_index_mask_get());

    public final int swigValue() {
      return swigValue;
    }

    public static type_bases swigToEnum(int swigValue) {
      type_bases[] swigValues = type_bases.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (type_bases swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + type_bases.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private type_bases() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private type_bases(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private type_bases(type_bases swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum string_types {
    user_agent(libtorrent_jni.settings_pack_user_agent_get()),
    announce_ip,
    mmap_cache,
    handshake_client_version,
    outgoing_interfaces,
    listen_interfaces,
    proxy_hostname,
    proxy_username,
    proxy_password,
    i2p_hostname,
    peer_fingerprint,
    max_string_setting_internal;

    public final int swigValue() {
      return swigValue;
    }

    public static string_types swigToEnum(int swigValue) {
      string_types[] swigValues = string_types.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (string_types swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + string_types.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private string_types() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private string_types(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private string_types(string_types swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum bool_types {
    allow_multiple_connections_per_ip(libtorrent_jni.settings_pack_allow_multiple_connections_per_ip_get()),
    deprecated1,
    send_redundant_have,
    lazy_bitfields,
    use_dht_as_fallback,
    upnp_ignore_nonrouters,
    use_parole_mode,
    use_read_cache,
    use_write_cache,
    dont_flush_write_cache,
    explicit_read_cache,
    coalesce_reads,
    coalesce_writes,
    auto_manage_prefer_seeds,
    dont_count_slow_torrents,
    close_redundant_connections,
    prioritize_partial_pieces,
    rate_limit_ip_overhead,
    announce_to_all_tiers,
    announce_to_all_trackers,
    prefer_udp_trackers,
    strict_super_seeding,
    lock_disk_cache,
    disable_hash_checks,
    allow_i2p_mixed,
    low_prio_disk,
    volatile_read_cache,
    guided_read_cache,
    no_atime_storage,
    incoming_starts_queued_torrents,
    report_true_downloaded,
    strict_end_game_mode,
    broadcast_lsd,
    enable_outgoing_utp,
    enable_incoming_utp,
    enable_outgoing_tcp,
    enable_incoming_tcp,
    ignore_resume_timestamps,
    no_recheck_incomplete_resume,
    anonymous_mode,
    report_web_seed_downloads,
    utp_dynamic_sock_buf,
    deprecated2,
    announce_double_nat,
    seeding_outgoing_connections,
    no_connect_privileged_ports,
    smooth_connects,
    always_send_user_agent,
    apply_ip_filter_to_trackers,
    use_disk_read_ahead,
    lock_files,
    contiguous_recv_buffer,
    ban_web_seeds,
    allow_partial_disk_writes,
    force_proxy,
    support_share_mode,
    support_merkle_torrents,
    report_redundant_bytes,
    listen_system_port_fallback,
    use_disk_cache_pool,
    announce_crypto_support,
    enable_upnp,
    enable_natpmp,
    enable_lsd,
    enable_dht,
    prefer_rc4,
    proxy_hostnames,
    proxy_peer_connections,
    auto_sequential,
    max_bool_setting_internal;

    public final int swigValue() {
      return swigValue;
    }

    public static bool_types swigToEnum(int swigValue) {
      bool_types[] swigValues = bool_types.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (bool_types swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + bool_types.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private bool_types() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private bool_types(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private bool_types(bool_types swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum int_types {
    tracker_completion_timeout(libtorrent_jni.settings_pack_tracker_completion_timeout_get()),
    tracker_receive_timeout,
    stop_tracker_timeout,
    tracker_maximum_response_length,
    piece_timeout,
    request_timeout,
    request_queue_time,
    max_allowed_in_request_queue,
    max_out_request_queue,
    whole_pieces_threshold,
    peer_timeout,
    urlseed_timeout,
    urlseed_pipeline_size,
    urlseed_wait_retry,
    file_pool_size,
    max_failcount,
    min_reconnect_time,
    peer_connect_timeout,
    connection_speed,
    inactivity_timeout,
    unchoke_interval,
    optimistic_unchoke_interval,
    num_want,
    initial_picker_threshold,
    allowed_fast_set_size,
    suggest_mode,
    max_queued_disk_bytes,
    handshake_timeout,
    send_buffer_low_watermark,
    send_buffer_watermark,
    send_buffer_watermark_factor,
    choking_algorithm,
    seed_choking_algorithm,
    cache_size,
    cache_buffer_chunk_size,
    cache_expiry,
    explicit_cache_interval,
    disk_io_write_mode,
    disk_io_read_mode,
    outgoing_port,
    num_outgoing_ports,
    peer_tos,
    active_downloads,
    active_seeds,
    active_dht_limit,
    active_tracker_limit,
    active_lsd_limit,
    active_limit,
    active_loaded_limit,
    auto_manage_interval,
    seed_time_limit,
    auto_scrape_interval,
    auto_scrape_min_interval,
    max_peerlist_size,
    max_paused_peerlist_size,
    min_announce_interval,
    auto_manage_startup,
    seeding_piece_quota,
    max_rejects,
    recv_socket_buffer_size,
    send_socket_buffer_size,
    file_checks_delay_per_block,
    read_cache_line_size,
    write_cache_line_size,
    optimistic_disk_retry,
    max_suggest_pieces,
    local_service_announce_interval,
    dht_announce_interval,
    udp_tracker_token_expiry,
    default_cache_min_age,
    num_optimistic_unchoke_slots,
    default_est_reciprocation_rate,
    increase_est_reciprocation_rate,
    decrease_est_reciprocation_rate,
    max_pex_peers,
    tick_interval,
    share_mode_target,
    upload_rate_limit,
    download_rate_limit,
    deprecated3,
    deprecated4,
    dht_upload_rate_limit,
    unchoke_slots_limit,
    deprecated5,
    connections_limit,
    connections_slack,
    utp_target_delay,
    utp_gain_factor,
    utp_min_timeout,
    utp_syn_resends,
    utp_fin_resends,
    utp_num_resends,
    utp_connect_timeout,
    deprecated6,
    utp_loss_multiplier,
    mixed_mode_algorithm,
    listen_queue_size,
    torrent_connect_boost,
    alert_queue_size,
    max_metadata_size,
    hashing_threads,
    checking_mem_usage,
    predictive_piece_announce,
    aio_threads,
    aio_max,
    network_threads,
    ssl_listen,
    tracker_backoff,
    share_ratio_limit,
    seed_time_ratio_limit,
    peer_turnover,
    peer_turnover_cutoff,
    peer_turnover_interval,
    connect_seed_every_n_download,
    max_http_recv_buffer_size,
    max_retry_port_bind,
    alert_mask,
    out_enc_policy,
    in_enc_policy,
    allowed_enc_level,
    inactive_down_rate,
    inactive_up_rate,
    proxy_type,
    proxy_port,
    i2p_port,
    max_int_setting_internal;

    public final int swigValue() {
      return swigValue;
    }

    public static int_types swigToEnum(int swigValue) {
      int_types[] swigValues = int_types.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int_types swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + int_types.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private int_types() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private int_types(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private int_types(int_types swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum settings_counts_t {
    num_string_settings(libtorrent_jni.settings_pack_num_string_settings_get()),
    num_bool_settings(libtorrent_jni.settings_pack_num_bool_settings_get()),
    num_int_settings(libtorrent_jni.settings_pack_num_int_settings_get());

    public final int swigValue() {
      return swigValue;
    }

    public static settings_counts_t swigToEnum(int swigValue) {
      settings_counts_t[] swigValues = settings_counts_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (settings_counts_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + settings_counts_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private settings_counts_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private settings_counts_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private settings_counts_t(settings_counts_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum suggest_mode_t {
    no_piece_suggestions(libtorrent_jni.settings_pack_no_piece_suggestions_get()),
    suggest_read_cache(libtorrent_jni.settings_pack_suggest_read_cache_get());

    public final int swigValue() {
      return swigValue;
    }

    public static suggest_mode_t swigToEnum(int swigValue) {
      suggest_mode_t[] swigValues = suggest_mode_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (suggest_mode_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + suggest_mode_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private suggest_mode_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private suggest_mode_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private suggest_mode_t(suggest_mode_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum choking_algorithm_t {
    fixed_slots_choker(libtorrent_jni.settings_pack_fixed_slots_choker_get()),
    rate_based_choker(libtorrent_jni.settings_pack_rate_based_choker_get()),
    bittyrant_choker(libtorrent_jni.settings_pack_bittyrant_choker_get());

    public final int swigValue() {
      return swigValue;
    }

    public static choking_algorithm_t swigToEnum(int swigValue) {
      choking_algorithm_t[] swigValues = choking_algorithm_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (choking_algorithm_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + choking_algorithm_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private choking_algorithm_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private choking_algorithm_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private choking_algorithm_t(choking_algorithm_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum seed_choking_algorithm_t {
    round_robin,
    fastest_upload,
    anti_leech;

    public final int swigValue() {
      return swigValue;
    }

    public static seed_choking_algorithm_t swigToEnum(int swigValue) {
      seed_choking_algorithm_t[] swigValues = seed_choking_algorithm_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (seed_choking_algorithm_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + seed_choking_algorithm_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private seed_choking_algorithm_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private seed_choking_algorithm_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private seed_choking_algorithm_t(seed_choking_algorithm_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum io_buffer_mode_t {
    enable_os_cache(libtorrent_jni.settings_pack_enable_os_cache_get()),
    deprecated(libtorrent_jni.settings_pack_deprecated_get()),
    disable_os_cache(libtorrent_jni.settings_pack_disable_os_cache_get());

    public final int swigValue() {
      return swigValue;
    }

    public static io_buffer_mode_t swigToEnum(int swigValue) {
      io_buffer_mode_t[] swigValues = io_buffer_mode_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (io_buffer_mode_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + io_buffer_mode_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private io_buffer_mode_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private io_buffer_mode_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private io_buffer_mode_t(io_buffer_mode_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum bandwidth_mixed_algo_t {
    prefer_tcp(libtorrent_jni.settings_pack_prefer_tcp_get()),
    peer_proportional(libtorrent_jni.settings_pack_peer_proportional_get());

    public final int swigValue() {
      return swigValue;
    }

    public static bandwidth_mixed_algo_t swigToEnum(int swigValue) {
      bandwidth_mixed_algo_t[] swigValues = bandwidth_mixed_algo_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (bandwidth_mixed_algo_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + bandwidth_mixed_algo_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private bandwidth_mixed_algo_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private bandwidth_mixed_algo_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private bandwidth_mixed_algo_t(bandwidth_mixed_algo_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum enc_policy {
    pe_forced,
    pe_enabled,
    pe_disabled;

    public final int swigValue() {
      return swigValue;
    }

    public static enc_policy swigToEnum(int swigValue) {
      enc_policy[] swigValues = enc_policy.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (enc_policy swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + enc_policy.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private enc_policy() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private enc_policy(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private enc_policy(enc_policy swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum enc_level {
    pe_plaintext(libtorrent_jni.settings_pack_pe_plaintext_get()),
    pe_rc4(libtorrent_jni.settings_pack_pe_rc4_get()),
    pe_both(libtorrent_jni.settings_pack_pe_both_get());

    public final int swigValue() {
      return swigValue;
    }

    public static enc_level swigToEnum(int swigValue) {
      enc_level[] swigValues = enc_level.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (enc_level swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + enc_level.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private enc_level() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private enc_level(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private enc_level(enc_level swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum proxy_type_t {
    none,
    socks4,
    socks5,
    socks5_pw,
    http,
    http_pw,
    i2p_proxy;

    public final int swigValue() {
      return swigValue;
    }

    public static proxy_type_t swigToEnum(int swigValue) {
      proxy_type_t[] swigValues = proxy_type_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (proxy_type_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + proxy_type_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private proxy_type_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private proxy_type_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private proxy_type_t(proxy_type_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
